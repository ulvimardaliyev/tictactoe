package tictactoe;

public class Elements {

    public String startWith;
    private String computerPlayWith;
    private static String startWithX = "X";
    private static String startWithO = "O";

    private int row;

    private int saveIntegerInsteadColumn;

    private static String userInputToGame[][] = new String[3][3];

    Elements(int row, String column, String playerInputX_O) {
        this.row = row;
        replaceLetterWithNum(column);
        this.startWith = playerInputX_O;
        this.computerPlayWith = playerInputX_O.equals("X") ? (this.computerPlayWith = this.getStartWithO())
                : (this.computerPlayWith = this.getStartWithX());
    }



    private void replaceLetterWithNum(String column) {

        if (column.equals("A")) {
            setSaveIntegerInsteadColumn(0);
        } else if (column.equals("B")) {
            setSaveIntegerInsteadColumn(1);
        } else if (column.equals("C")) {
            setSaveIntegerInsteadColumn(2);
        }
    }

    public static void getRidOfNullElements() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                userInputToGame[i][j] = " ";
            }
        }
    }

    public String getStartWithX() {
        return startWithX;
    }

    public String getStartWithO() {
        return startWithO;
    }

    public static String[][] getUserInputToGame() {
        return userInputToGame;
    }

    public int getSaveIntegerInsteadColumn() {
        return saveIntegerInsteadColumn;
    }

    public void setSaveIntegerInsteadColumn(int saveIntegerInsteadColumn) {
        this.saveIntegerInsteadColumn = saveIntegerInsteadColumn;
    }

    public String getComputerPlayWith() {
        return computerPlayWith;
    }

    public int getRow() {
        return row;
    }
}
