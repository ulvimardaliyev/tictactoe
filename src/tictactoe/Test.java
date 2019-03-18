package tictactoe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {

        String regex = "[1-3][,][\\s][A-C]";
        String inp = "1, A";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inp);

        System.out.println(matcher.find());
    }
}
