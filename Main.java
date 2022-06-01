import java.util.Scanner;

public class Main {

    static boolean playGame(String text) {
        Constants.labyrinth = new Labyrinth();
        Constants.labyrinth.printMap();
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to play a game? (Yes/No)");
        boolean alive = true;
        String play = in.nextLine();
        if (play.equalsIgnoreCase("Yes") || play.equalsIgnoreCase("Y")) {
            while (alive) {
                System.out.println(
                        "Welcome to the game.\nType help for commands, and exit to leave the game. Use single word commands.\n-------------------------------------\n FILLER TEXT. PUT STARTING STUFF HERE");
                alive = playGame(in.nextLine());
            }
        }

    }
}
