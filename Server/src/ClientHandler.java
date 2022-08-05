import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable {
    Socket connection;

    public ClientHandler(Socket connection) {
        this.connection = connection;
    }

    @Override
    public void run() {
        try {
            //Services available
            // 1. SignUp 2. LogIn 3. Quit
            // 1 -> 1 | 2.1 -> Play Game    2.2 -> Quit
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String message = "";

            UserDataStore userDataStore = UserDataStore.getInstance();

            //Read
            while (true) {
                userDataStore.userMap();

                String input = br.readLine();
                if (input != null) {

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


        } catch (IOException e) {
            System.out.println("IOexception");
        }
    }
}
