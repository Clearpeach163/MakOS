import java.util.Scanner;

public class Main {
    private static final String RESET = "\u001B[0m";
    private static final String WHITE = "\u001B[97m";
    private static final String GOLD = "\u001B[38;5;220m";
    private static final String RED = "\u001B[91m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            clearTerminal();
            displayTitle();
            System.out.println("[1] French");
            System.out.println("[2] Dutch");
            System.out.println("[3] English");
            System.out.println("[4] Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    StudyMenu.showFrenchMenu(scanner);
                    break;
                case "2":
                    StudyMenu.showDutchMenu(scanner);
                    break;
                case "3":
                    StudyMenu.showEnglishMenu(scanner);
                    break;
                case "4":
                    clearTerminal();
                    System.out.println(WHITE + "Exiting Studyno. Goodbye!" + RESET);
                    scanner.close();
                    return;
                default:
                    clearTerminal();
                    System.err.println(RED + "ERROR: Please enter a valid number!" + RESET);
                    System.out.print("Press Enter to continue...");
                    scanner.nextLine();
                    break;
            }
        }
    }

    private static void displayTitle() {
        System.out.println(
            GOLD +
            "  ███████╗████████╗██╗   ██╗██████╗ ██╗   ██╗" + GOLD + " ███╗   ██╗ ██████╗\n" +
            "  ██╔════╝╚══██╔══╝██║   ██║██╔══██╗╚██╗ ██╔╝" + GOLD + " ████╗  ██║██╔═══██╗\n" +
            "  ███████╗   ██║   ██║   ██║██║  ██║ ╚████╔╝ " + GOLD + " ██╔██╗ ██║██║   ██║\n" +
            "  ╚════██║   ██║   ██║   ██║██║  ██║  ╚██╔╝  " + GOLD + " ██║╚██╗██║██║   ██║\n" +
            "  ███████║   ██║   ╚██████╔╝██████╔╝   ██║   " + GOLD + " ██║ ╚████║╚██████╔╝\n" +
            "  ╚══════╝   ╚═╝    ╚═════╝ ╚═════╝    ╚═╝   " + GOLD + " ╚═╝  ╚═══╝ ╚═════╝" +
            RESET
        );
        System.out.println(GOLD + "========================================================================" + RESET);
        System.out.println(GOLD + "Version: 1.0.0" + RESET);
        System.out.println(WHITE + "Welcome to Studyno!" + RESET);
        System.out.println(GOLD + "========================================================================" + RESET);
    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
