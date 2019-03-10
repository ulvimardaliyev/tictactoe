package tictactoe;

import java.util.Random;

public class GameProcessing {

    private Elements elements;

    Random random = new Random();

    private int first;
    private int second;

    public GameProcessing(Elements elements) {
        this.elements = elements;
        this.first = random.nextInt(2);
        this.second = random.nextInt(2);
    }


    public void doProcess() {
        Elements.getUserInputToGame()[elements.getRow() - 1][elements.getSaveIntegerInsteadColumn()]
                = elements.startWith;
        while (true) {

            if (Elements.getUserInputToGame()[first][second] == null
                    || Elements.getUserInputToGame()[first][second].isEmpty()) {
                Elements.getUserInputToGame()[first][second] = "O";

                break;
            } else {
                this.first = random.nextInt(2);
                this.second = random.nextInt(2);
                System.out.println("Good");
            }

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
