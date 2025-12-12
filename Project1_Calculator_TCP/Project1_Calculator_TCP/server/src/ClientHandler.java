import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class ClientHandler extends Thread {
    Socket socket;

    public ClientHandler(Socket s) {
        this.socket = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader in =
                new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter out =
                new PrintWriter(socket.getOutputStream(), true);

            String line1 = in.readLine(); // NUMBER:<value>
            String line2 = in.readLine(); // NUMBER:<value>
            String line3 = in.readLine(); // OPERATOR:<...>

            if (line1 == null || line2 == null || line3 == null) {
                out.println("ERROR:Incomplete request");
                socket.close();
                return;
            }

            // --- Validation ---
            if (!line1.startsWith("NUMBER:") ||
                !line2.startsWith("NUMBER:") ||
                !line3.startsWith("OPERATOR:")) {

                out.println("ERROR:Invalid format");
                socket.close();
                return;
            }

            double a, b;
            try {
                a = Double.parseDouble(line1.substring(7).trim());
                b = Double.parseDouble(line2.substring(7).trim());
            } catch (NumberFormatException nfe) {
                out.println("ERROR:Non-numeric value");
                socket.close();
                return;
            }

            String opStr = line3.substring(9).trim();
            if (opStr.length() == 0) {
                out.println("ERROR:Missing operator");
                socket.close();
                return;
            }
            char op = opStr.charAt(0);

            double result;
            switch (op) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/':
                    if (b == 0) {
                        out.println("ERROR:Division by zero");
                        socket.close();
                        return;
                    }
                    result = a / b;
                    break;
                default:
                    out.println("ERROR:Unknown operator");
                    socket.close();
                    return;
            }

            out.println("RESULT:" + result);
            log(a, b, op, result);

        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        } finally {
            try { socket.close(); } catch(Exception ex) {}
        }
    }

    private void log(double a, double b, char op, double result) {
        try (FileWriter fw = new FileWriter("server/logs/server.log", true)) {
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            fw.write("[" + time + "] " + a + " " + op + " " + b + " = " + result + "\n");
        } catch (IOException e) {
            System.out.println("Logging error: " + e.getMessage());
        }
    }
}
