package tictactoe;

public class Elements {

    public String startWith;
    private static String startWithX;
    private static String startWithO;

    private int row;

    private int saveIntegerInsteadColumn;

    private static String userInputToGame[][] = new String[3][3];

    Elements(int row, String column, String p) {
        this.row = row;
        replaceLetterWithNum(column);
        this.startWith = p;
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

    public void setStartWithX(String startWithX) {
        this.startWithX = startWithX;
    }

    public void setStartWithO(String startWithO) {
        this.startWithO = startWithO;
    }

    public int getSaveIntegerInsteadColumn() {
        return saveIntegerInsteadColumn;
    }

    public void setSaveIntegerInsteadColumn(int saveIntegerInsteadColumn) {
        this.saveIntegerInsteadColumn = saveIntegerInsteadColumn;
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

    public int getRow() {
        return row;
    }
}
