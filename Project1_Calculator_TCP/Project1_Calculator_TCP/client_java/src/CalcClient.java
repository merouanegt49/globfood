import java.io.*;
import java.net.*;

public class CalcClient {
    public static void main(String[] args) throws Exception {
        String host = "127.0.0.1";
        int port = 5000;
        if (args.length >= 1) host = args[0];
        if (args.length >= 2) port = Integer.parseInt(args[1]);

        Socket socket = new Socket(host, port);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        System.out.print("First number: ");
        String a = keyboard.readLine();

        System.out.print("Second number: ");
        String b = keyboard.readLine();

        System.out.print("Operator (+,-,*,/): ");
        String op = keyboard.readLine();

        out.println("NUMBER:" + a);
        out.println("NUMBER:" + b);
        out.println("OPERATOR:" + op);

        String response = in.readLine();
        System.out.println("Server -> " + response);

        socket.close();
    }
}
