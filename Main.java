import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("user.properties"); // Create a File object for the user.properties file
        if (file.exists()) { // Check if the file exists
            // YES the file exists, That means the user already has a login account
            loginWindow();
        } else {
            // No the file doesnt exist, Let's create a user file!
            createUserwindow();
        }
    }
    public static void loginWindow() {
        Login.show();
    }

    public static void createUserwindow() {
        CreateUser.show();
    }
}