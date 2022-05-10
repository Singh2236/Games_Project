import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;


public class Server {
    private static Socket connection;
    private static ServerSocket serverSocket;

    public static void main(String[] args) throws IOException {
        serverSocket = new ServerSocket(4566); //Server Socket ne port Issue karni hundi a
        System.out.println("ServerSocket is waiting for clients ");
        connection = serverSocket.accept();
        System.out.println("Connected with client");

        //Services available
        // 1. SignUp 2. LogIn 3. Quit
        // 1 -> 1 | 2.1 -> Play Game    2.2 -> Quit
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String message = "";

        UserDataStore userDataStore = UserDataStore.getInstance();
        try {

            //Read
            while (true) {
                userDataStore.userMap();
                System.out.println("11");
                String input = br.readLine();
                System.out.println("12");
                if (input != null) {
                    System.out.println("13");
                    System.out.println("Clint wants to: " + input);


                    //if input -> signup
                    if (input.equals("SignUp")) {
                        System.out.println("Expecting SignUpData");
                        String userNamePassData = br.readLine();
                        String[] userNamePass = userNamePassData.split(" ");
                        String userName = String.valueOf(userNamePass[0]);
                        String password = String.valueOf(userNamePass[1]);
                        ServerSignUp signup = new ServerSignUp();
                        message = signup.signup(userName, password);

                    }
                    else if (input.equals("login")) {
                        System.out.println("Expecting LogInDataFromUser");
                        String userNamePassData = br.readLine();
                        String[] userNamePass = userNamePassData.split(" ");
                        String userName = userNamePass[0];
                        String password = userNamePass[1];
                        message = String.valueOf(userDataStore.isLoginCorrect(userName, password));
                        System.out.println(message);


                    }
                    else if (input.equals("quit") || input.equals("Quit")) {
                        break;

                    }
                    else {
                        message = "please do something sensible";
                    }
                }
                else
                    System.out.println("Still waiting");

                //write
                bw.write(message + "\n");
                bw.flush();

            }
            bw.close();
            br.close();
            connection.close();

        } catch (SocketException e) {
            System.out.println("Server is Shutting Down becouse of no clients");
        }
    }


}
