public class ServerSignUp {
    UserDataStore userDataStore = UserDataStore.getInstance();


    public ServerSignUp() {
    }

    public String signup(String userName, String password) {

        System.out.println("Here we are Signing Up");


        if (!userDataStore.isUserNameTaken(userName)) {
            userDataStore.register(userName, password);
            System.out.println("registration successful");
            return "Registration Successful";
        }

        else {
            System.out.println("Username taken!");
            return "Username taken! Try Again to SignUp";
        }
    }
}
