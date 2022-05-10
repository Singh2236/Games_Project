import java.io.IOException;
import java.util.Scanner;

public class ClientLogIn {

    public String signInData() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String userName = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        return userName + " " + password + "\n";
    }
}
