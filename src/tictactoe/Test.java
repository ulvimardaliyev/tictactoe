package tictactoe;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (Pattern.matches("[1-3][,][\\s][A-C]", userInput)) {
            String userPositionInput[] = userInput.split(", ");
            //Elements e = new Elements(Integer.parseInt(userPositionInput[0]), userPositionInput[1]);

        }
    }
}
