import java.net.*;
public class CalcServer {

    public static void main(String[] args) throws Exception {
        int port = 5000;
        if (args.length > 0) {
            try { port = Integer.parseInt(args[0]); } catch(Exception e) {}
        }
        ServerSocket server = new ServerSocket(port);
        System.out.println("Server started on port " + port);

        while (true) {
            Socket client = server.accept();
            new ClientHandler(client).start();
        }
    }
}
