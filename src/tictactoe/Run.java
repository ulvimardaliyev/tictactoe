package tictactoe;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {

    private static String playerInputX_O;
    private String playerEnteredPosition;
    static int playedGameCount;
    private String dividePlayerEnteredPositionToRowAndGameElement[];
    private static final String regex = "[1-3][,][\\s][A-C]";

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe game.");
        System.out.println("Please, select an element to start a game: which do you want? X or O");
        Scanner scanner = new Scanner(System.in);
        Run run = new Run();
        Elements.getRidOfNullElements();
        run.createAnElementToStartAGame(scanner);
        System.out.println(" " + " A" + " " + " " + " " + " B" + " " + " " + " " + " C");
        String printer = "1" + "  " + Elements.getKeepPlayerEnteredPositions()[0][0] + " " + "|" + " " + Elements.getKeepPlayerEnteredPositions()[0][1] + " " + "| " + Elements.getKeepPlayerEnteredPositions()[0][2] + "\n"
                + " " + " " + " " + " " + " | " + " " + " " + "|\n"
                + " - " + "- " + "- " + "- " + "- " + "- " + "- \n"
                + "2" + " " + " " + Elements.getKeepPlayerEnteredPositions()[1][0] + " " + "|" + " " + Elements.getKeepPlayerEnteredPositions()[1][1] + " " + "| " + Elements.getKeepPlayerEnteredPositions()[1][2] + "\n"
                + " " + " " + " " + " " + " " + "|" + " " + " " + " " + "|\n"
                + " - " + "- " + "- " + "- " + "- " + "- " + "- \n"
                + "3" + " " + " " + Elements.getKeepPlayerEnteredPositions()[2][0] + " " + "|" + " " + Elements.getKeepPlayerEnteredPositions()[2][1] + " " + "| " + Elements.getKeepPlayerEnteredPositions()[2][2] + "\n"
                + " " + " " + " " + " " + " " + "|" + " " + " " + " " + "|\n";
        System.out.println(printer);

        Pattern pattern = Pattern.compile(regex);


        for (playedGameCount = 0; playedGameCount < 5; playedGameCount++) {
            while (true) {
                run.playerEnteredPosition = scanner.nextLine();
                Matcher matcher = pattern.matcher(run.playerEnteredPosition);
                if (matcher.find()) {
                    run.dividePlayerEnteredPositionToRowAndGameElement = run.playerEnteredPosition.split(", ");
                    Elements e = new Elements(Integer.parseInt(run.dividePlayerEnteredPositionToRowAndGameElement[0]),
                            run.dividePlayerEnteredPositionToRowAndGameElement[1], playerInputX_O);

                    GameProcessing gameProcessing = new GameProcessing(e);
                    gameProcessing.doProcess(playedGameCount);
                    if (gameProcessing.winsUserOrComputer()) {
                        System.out.println("You won");
                        playedGameCount = 5;
                    }
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
