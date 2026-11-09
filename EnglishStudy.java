import java.util.Scanner;

public class EnglishStudy {
    private static final String RESET = "\u001B[0m";
    private static final String WHITE = "\u001B[97m";
    private static final String GOLD = "\u001B[38;5;220m";
    private static final String RED = "\u001B[91m";

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            clearTerminal();
            System.out.println(GOLD + "=== English Study ===" + RESET);
            System.out.println("[1] Vocabulary");
            System.out.println("[2] Reading practice");
            System.out.println("[3] Back to main menu");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    System.out.println(WHITE + "English vocabulary lessons are coming soon." + RESET);
                    pause(scanner);
                    return;
                case "2":
                    System.out.println(WHITE + "Reading practice is coming soon." + RESET);
                    pause(scanner);
                    return;
                case "3":
                    return;
                default:
                    System.err.println(RED + "ERROR: Please enter a valid number!" + RESET);
                    pause(scanner);
                    break;
            }
        }
    }

    private static void pause(Scanner scanner) {
        System.out.print("Press Enter to continue...");
        scanner.nextLine();
    }

    private static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
