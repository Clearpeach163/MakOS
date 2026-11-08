
import java.util.Scanner;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateUser {

    public static void show() {

        Scanner scanner = new Scanner(System.in);

        // Ask for username
        String userName;

        while (true) {
            System.out.println("Type username:");
            userName = scanner.nextLine();

            if (!userName.isBlank()) {
                break;
            }

            System.out.println("Username cannot be empty. Please try again.\n");
        }

        // Password creation
        while (true) {

            System.out.println("Enter a password for " + userName + ":");
            String password = scanner.nextLine();

            // Check password length
            if (password.length() < 8) {
                System.out.println("Password too short (at least 8 characters).\n");
                continue;
            }

            // Confirm password
            System.out.println("Confirm password:");
            String passwordConfirm = scanner.nextLine();

            // Compare passwords
            if (password.equals(passwordConfirm)) {

                System.out.println("\nAccount created successfully for user: " + userName);
                break;

            } else {

                System.out.println("Passwords do not match. Please try again.\n");

            }
        }
    }
}
