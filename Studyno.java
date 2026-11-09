import java.util.Scanner;

public class Studyno {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_WHITE = "\u001B[97m";
    private static final String ANSI_GOLD = "\u001B[38;5;220m";
    private static final String ANSI_RED = "\u001B[91m";

    public static void main(String[] args) {
        clearTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            ANSI_GOLD +
            ANSI_WHITE + "  ███████╗████████╗██╗   ██╗██████╗ ██╗   ██╗" + ANSI_GOLD + " ███╗   ██╗ ██████╗\n" +
            ANSI_WHITE + "  ██╔════╝╚══██╔══╝██║   ██║██╔══██╗╚██╗ ██╔╝" + ANSI_GOLD + " ████╗  ██║██╔═══██╗\n" +
            ANSI_WHITE + "  ███████╗   ██║   ██║   ██║██║  ██║ ╚████╔╝ " + ANSI_GOLD + " ██╔██╗ ██║██║   ██║\n" +
            ANSI_WHITE + "  ╚════██║   ██║   ██║   ██║██║  ██║  ╚██╔╝  " + ANSI_GOLD + " ██║╚██╗██║██║   ██║\n" +
            ANSI_WHITE + "  ███████║   ██║   ╚██████╔╝██████╔╝   ██║   " + ANSI_GOLD + " ██║ ╚████║╚██████╔╝\n" +
            ANSI_WHITE + "  ╚══════╝   ╚═╝    ╚═════╝ ╚═════╝    ╚═╝   " + ANSI_GOLD + " ╚═╝  ╚═══╝ ╚═════╝" +
            ANSI_RESET
        );

        System.out.println(ANSI_GOLD + "========================================================================" + ANSI_RESET);
        System.out.println(ANSI_GOLD + "Version: 1.0.0" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "Welcome to the Studyno Terminal Application!" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "========================================================================" + ANSI_RESET);
        System.out.println("[1] Start study session");
        System.out.println("[2] Donation page");
        System.out.println("[3] Exit");

        String userChoice = scanner.nextLine();

        if (userChoice.equals("1")) {
            Menu.menu(args);
        } else if (userChoice.equals("2")) {
            System.out.println(ANSI_WHITE + "Please visit our donation page at:" + ANSI_GOLD + " https://www.donate.com/studyno " + ANSI_RESET);
        } else if (userChoice.equals("3")) {
            clearTerminal();
            System.out.println(ANSI_WHITE + "Exiting the application. Goodbye!" + ANSI_RESET);
            System.exit(0);
        } else {
            clearTerminal();
            System.err.println(ANSI_RED + "ERROR: Please enter a valid number!" + ANSI_RESET);
        }

        scanner.close();
    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
