import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    private static Socket connection;
    private static ServerSocket serverSocket;

    public static void main(String[] args) throws IOException {
        try {
            serverSocket = new ServerSocket(4566); //Server Socket ne port Issue karni hundi a
            System.out.println("ServerSocket is waiting for clients ");

            while (true) {
                connection = serverSocket.accept();
                System.out.println("Connected with client");


                ClientHandler clientHandler = new ClientHandler(connection);
                Thread thread = new Thread(clientHandler);
                thread.start();

            }


        } catch (IOException e) {
            System.out.println("IOexception ");
        }
    }


}
