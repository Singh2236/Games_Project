
import java.io.*;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    private static Socket connection;
    static String ip = "localhost";
    static int port = 4566;

    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            connection = new Socket(ip, port);
            System.out.println("Connection Established. ");

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            Scanner scanner = new Scanner(System.in);


            //Services available
            // 1. SignUp 2. LogIn 3. Quit
            // 1 -> 1 | 2.1 -> Play Game    2.2 -> Quit
            while (true) {
                System.out.println("1. SignUp \n2. LogIn\n3. Quit ");
                System.out.print("Your input: ");
                String input = scanner.nextLine();

                String serviceRequest;
                if ("1".equals(input)) {
                    serviceRequest = "SignUp\n";
                    bw.write(serviceRequest);
                    bw.flush();

                    //method to give server username and password
                    ClientSignUp clientSignUp = new ClientSignUp();
                    bw.write(clientSignUp.getUserPass());
                    bw.flush();

                    String msgFromServer = br.readLine();
                    System.out.println(msgFromServer);
                }
                else if ("2".equals(input)) {
                    serviceRequest = "login\n";
                    bw.write(serviceRequest);
                    bw.flush();

                    ClientLogIn clientlogin = new ClientLogIn();
                    String signInData = clientlogin.signInData();
                    bw.write(signInData);
                    bw.flush();

                    String verification = br.readLine();
                    if (verification.equals("true")) {
                        System.out.println("LoggedInSuccessfully");
                        GamesHome.playGames();
                        System.out.println("playing games");
                    }
                    else if (verification.equals("false")) {
                        System.out.println("please try again!");

                    }
                    else System.out.println("neither true nor false");
                }
                else if (input.equals("3")) {
                    serviceRequest = "quit";
                    break;
                }
                else System.out.println("Try Again!");


            }

            bw.close();
            br.close();
            connection.close();


        } catch (ConnectException e) {
            System.out.println("Client Disconnected");
        }
    }

}
