package tictactoe;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Run {

    public static int playedGameCount;

    public static void main(String[] args) {
        Run run = new Run();
        run.startGame();
    }

    public String chooseX_OToStartGame(Scanner scanner) {

        while (true) {
            String playWithX_O = scanner.next();
            if (playWithX_O.equals("X")) {
                System.out.println("Okay, let's start with " + "\"X\"");
                return playWithX_O;
            } else if (playWithX_O.equals("O")) {
                System.out.println("Okay, let's start with " + "\"O\"");
                return playWithX_O;
            } else {
                System.err.println("No no no. Please, enter correct element, X or O");
            }
        }
    }

    public void startGame() {

        System.out.println("Welcome to TicTacToe game."+"\n"+
                "Please, select an element to start a game: which do you want? X or O");


        Scanner scanner = new Scanner(System.in);

        Elements.getRidOfNullElements();//adi static olmayan
        String playWithX_O = this.chooseX_OToStartGame(scanner);

        System.out.println(this.playground());
        final String regex = "[1-3][,][\\s][A-C]";
        Pattern pattern = Pattern.compile(regex);

        Predicate<String> matchUserInputPositionToRegex =
                (userPosition) -> pattern.matcher(userPosition).find();

        String playerEnteredPosition;
        String dividePlayerEnteredPositionToRowAndColumn[];

        for (playedGameCount = 0; playedGameCount < 5; playedGameCount++) {

            while (true) {
                playerEnteredPosition = scanner.nextLine();

                if (matchUserInputPositionToRegex.test(playerEnteredPosition)) {
                    dividePlayerEnteredPositionToRowAndColumn = playerEnteredPosition.split(", ");
                    Elements elements = new Elements(Integer.parseInt(dividePlayerEnteredPositionToRowAndColumn[0]),
                            dividePlayerEnteredPositionToRowAndColumn[1], playWithX_O);

                    GameProcessing gameProcessing = new GameProcessing(elements);
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

    public String playground() {
        String column = " " + " A" + " " + " " + " " + " B" + " " + " " + " " + " C";
        String row = "1" + "  " + Elements.getKeepPlayerEnteredPositions()[0][0] + " " + "|" + " " + Elements.getKeepPlayerEnteredPositions()[0][1] + " " + "| " + Elements.getKeepPlayerEnteredPositions()[0][2] + "\n"
                + " " + " " + " " + " " + " | " + " " + " " + "|\n"
                + " - " + "- " + "- " + "- " + "- " + "- " + "- \n"
                + "2" + " " + " " + Elements.getKeepPlayerEnteredPositions()[1][0] + " " + "|" + " " + Elements.getKeepPlayerEnteredPositions()[1][1] + " " + "| " + Elements.getKeepPlayerEnteredPositions()[1][2] + "\n"
                + " " + " " + " " + " " + " " + "|" + " " + " " + " " + "|\n"
                + " - " + "- " + "- " + "- " + "- " + "- " + "- \n"
                + "3" + " " + " " + Elements.getKeepPlayerEnteredPositions()[2][0] + " " + "|" + " " + Elements.getKeepPlayerEnteredPositions()[2][1] + " " + "| " + Elements.getKeepPlayerEnteredPositions()[2][2] + "\n"
                + " " + " " + " " + " " + " " + "|" + " " + " " + " " + "|\n";
        return column + "\n" + row;
    }
}
