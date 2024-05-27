import java.util.ArrayList;
import java.util.List;

class User {
    private String username;
    private String email;
    private String phoneNumber;
    private String password;
    private String pin;

    public User(String username, String email, String phoneNumber, String password, String pin) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.pin = pin;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getPin() {
        return pin;
    }
}

public class UserManager {
    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    // Method to register a new user
    public void registerUser(String username, String email, String phoneNumber, String password, String pin) {
        users.add(new User(username, email, phoneNumber, password, pin));
    }

    // Method overloads for user authentication
    public boolean authenticate(String username, String password) {
        for (User user : users) {
            if (user.getUsername() != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean authenticate(String email, String password) {
        for (User user : users) {
            if (user.getEmail() != null && user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean authenticate(String phoneNumber, String pin) {
        for (User user : users) {
            if (user.getPhoneNumber() != null && user.getPhoneNumber().equals(phoneNumber) && user.getPin().equals(pin)) {
                return true;
            }
        }
        return false;
    }

    // Additional methods can be added for more flexibility or features
}
