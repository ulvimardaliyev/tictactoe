package tictactoe;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Run {

    private static String playerInputX_O;
    private String playerInputPosition;
    static int playedGameCount;
    private String userInputPosition[];

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe game.");
        System.out.println("Please, select an element to start a game: which do you want? X or O");
        Scanner scanner = new Scanner(System.in);
        Run run = new Run();

        run.createAnElementToStartAGame(scanner);

        for (playedGameCount = 0; playedGameCount < 5; playedGameCount++) {
            while (true) {
                run.playerInputPosition = scanner.nextLine();
                if (Pattern.matches("[1-3][,][\\s][A-C]", run.playerInputPosition)) {
                    run.userInputPosition = run.playerInputPosition.split(", ");
                    Elements e = new Elements(Integer.parseInt(run.userInputPosition[0]), run.userInputPosition[1], playerInputX_O);
                    GameProcessing gameProcessing = new GameProcessing(e);
                    gameProcessing.doProcess(playedGameCount);
                    break;
                } else {
                    System.err.println("Please, enter correct style: \"1, B\" or \"2, C\"");
                }
            }
        }
    }

    public void createAnElementToStartAGame(Scanner scanner) {
        while (true) {
            playerInputX_O = scanner.next();
            if (playerInputX_O.equals("X")) {
                System.out.println("Okay, let's start with " + "\"X\"");
                break;
            } else if (playerInputX_O.equals("O")) {
                System.out.println("Okay, let's start with " + "\"O\"");
                break;
            } else {
                System.err.println("No no no. Please, enter correct element, X or O");
            }
        }
    }
}
