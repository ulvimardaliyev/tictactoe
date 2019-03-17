package tictactoe;

import java.util.Random;

public class GameProcessing {

    private Elements elements;

    private Random random = new Random();

    private int firstIndex;
    private int secondIndex;

    public GameProcessing(Elements elements) {
        this.elements = elements;
        this.firstIndex = random.nextInt(3);
        this.secondIndex = random.nextInt(3);
    }


    public void doProcess(int playedGameCount) {

        if (Elements.getUserInputToGame()[elements.getRow() - 1][elements.getSaveIntegerInsteadColumn()] == null) {
            Elements.getUserInputToGame()[elements.getRow() - 1][elements.getSaveIntegerInsteadColumn()]
                    = elements.startWith;
            while (playedGameCount != 4) {
                System.out.println(firstIndex + " " + secondIndex);
                if (Elements.getUserInputToGame()[firstIndex][secondIndex] == null) {
                    Elements.getUserInputToGame()[firstIndex][secondIndex] = elements.getComputerPlayWith();
                    break;
                } else {
                    this.firstIndex = random.nextInt(3);
                    this.secondIndex = random.nextInt(3);
                }
            }
        } else {
            System.out.println(elements.getRow() + "," + elements.getSaveIntegerInsteadColumn() +
                    " box is not empty");
            --Run.playedGameCount;
        }


        System.out.println(" " + " A" + " " + " " + " " + " B" + " " + " " + " " + " C");
        String printer = "1" + "  " + Elements.getUserInputToGame()[0][0] + " " + "|" + " " + Elements.getUserInputToGame()[0][1] + " " + "| " + Elements.getUserInputToGame()[0][2] + "\n"
                + " " + " " + " " + " " + " | " + " " + " " + "|\n"
                + " - " + "- " + "- " + "- " + "- " + "- " + "- \n"
                + "2" + " " + " " + Elements.getUserInputToGame()[1][0] + " " + "|" + " " + Elements.getUserInputToGame()[1][1] + " " + "| " + Elements.getUserInputToGame()[1][2] + "\n"
                + " " + " " + " " + " " + " " + "|" + " " + " " + " " + "|\n"
                + " - " + "- " + "- " + "- " + "- " + "- " + "- \n"
                + "3" + " " + " " + Elements.getUserInputToGame()[2][0] + " " + "|" + " " + Elements.getUserInputToGame()[2][1] + " " + "| " + Elements.getUserInputToGame()[2][2] + "\n"
                + " " + " " + " " + " " + " " + "|" + " " + " " + " " + "|\n";
        System.out.println(printer);
    }
}
