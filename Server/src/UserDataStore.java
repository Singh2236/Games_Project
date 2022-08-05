import java.util.HashMap;
import java.util.Map;

public class UserDataStore {
    private static UserDataStore instance;

    private final Map<String, String> userMap = new HashMap<>();

    public static UserDataStore getInstance() {
        if (instance == null) {
            instance = new UserDataStore();
        }
        return instance;
    }

    private UserDataStore(){   // private constructors, singleton classes

    }

    public synchronized boolean isUserNameTaken(String username) {
        if (userMap != null) {
            return userMap.containsKey(username);
        }
        else {
            return false;
        }

    }

    public synchronized void register(String username, String password) {
        userMap.put(username, password);

    }

    public synchronized boolean isLoginCorrect(String userName, String password) {
        if (!userMap.containsKey(userName)) {
            return false;
        }
        String storedPassword = userMap.get(userName);
        return password.equals(storedPassword);
    }

    public void userMap() {
        System.out.println(userMap);
    }

}
