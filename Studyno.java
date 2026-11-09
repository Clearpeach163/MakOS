

public class Studyno {
    public static void main(String[] args) {
        String RESET = "\u001B[0m";
        String WHITE_YES = "\u001B[97m";
        String WHITE = "\u001B[38;5;220m";
        String BLACK = "\u001B[97m";
                System.out.println(
            WHITE +
            BLACK + "  ███████╗████████╗██╗   ██╗██████╗ ██╗   ██╗" + WHITE + " ███╗   ██╗ ██████╗\n" +
            BLACK + "  ██╔════╝╚══██╔══╝██║   ██║██╔══██╗╚██╗ ██╔╝" + WHITE + " ████╗  ██║██╔═══██╗\n" +
            BLACK + "  ███████╗   ██║   ██║   ██║██║  ██║ ╚████╔╝ " + WHITE + " ██╔██╗ ██║██║   ██║\n" +
            BLACK + "  ╚════██║   ██║   ██║   ██║██║  ██║  ╚██╔╝  " + WHITE + " ██║╚██╗██║██║   ██║\n" +
            BLACK + "  ███████║   ██║   ╚██████╔╝██████╔╝   ██║   " + WHITE + " ██║ ╚████║╚██████╔╝\n" +
            BLACK + "  ╚══════╝   ╚═╝    ╚═════╝ ╚═════╝    ╚═╝   " + WHITE + " ╚═╝  ╚═══╝ ╚═════╝" +
            RESET
        );
        System.out.println(WHITE + "==========================================" + RESET);
        System.out.println(WHITE + "Version: 1.0.0" + RESET);
        System.out.println(WHITE_YES + "Welcome to the Studyno Terminal Application!" + RESET);
    }

}