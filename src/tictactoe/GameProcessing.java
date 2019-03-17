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

        if (Elements.getKeepPlayerEnteredPositions()[elements.getRow() - 1][elements.getSaveIndexInsteadColumn()].trim().isEmpty()) {
            Elements.getKeepPlayerEnteredPositions()[elements.getRow() - 1][elements.getSaveIndexInsteadColumn()]
                    = elements.startWith;
            while (playedGameCount != 4) {
                if (Elements.getKeepPlayerEnteredPositions()[firstIndex][secondIndex].trim().isEmpty()) {
                    Elements.getKeepPlayerEnteredPositions()[firstIndex][secondIndex] = elements.getComputerPlayWith();
                    break;
                } else {
                    this.firstIndex = random.nextInt(3);
                    this.secondIndex = random.nextInt(3);
                }
            }
        } else {
            System.out.println(elements.getRow() + "," + elements.getSaveIndexInsteadColumn() +
                    " box is not empty");
            --Run.playedGameCount;
        }


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
    }

    public boolean winsUserOrComputer() {

        if (Elements.getKeepPlayerEnteredPositions()[0][0].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[0][1].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[0][2].equals(elements.startWith)) {
            return true;
        } else if (Elements.getKeepPlayerEnteredPositions()[1][0].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[1][1].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[1][2].equals(elements.startWith)) {
            return true;
        } else if (Elements.getKeepPlayerEnteredPositions()[2][0].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[2][1].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[2][2].equals(elements.startWith)) {
            return true;
        } else if (Elements.getKeepPlayerEnteredPositions()[0][0].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[1][0].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[2][0].equals(elements.startWith)) {
            return true;
        } else if (Elements.getKeepPlayerEnteredPositions()[0][1].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[1][1].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[2][1].equals(elements.startWith)) {
            return true;
        } else if (Elements.getKeepPlayerEnteredPositions()[0][2].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[1][2].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[2][2].equals(elements.startWith)) {
            return true;
        } else if (Elements.getKeepPlayerEnteredPositions()[0][0].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[1][1].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[2][2].equals(elements.startWith)) {
            return true;
        } else if (Elements.getKeepPlayerEnteredPositions()[0][2].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[1][1].equals(elements.startWith)
                && Elements.getKeepPlayerEnteredPositions()[2][0].equals(elements.startWith)) {
            return true;
        }

        return false;
    }
}
