package tictactoe;

public class Elements {

    public String startWith;
    private String computerPlayWith;
    private static String startWithX = "X";
    private static String startWithO = "O";

    private int row;

    private int saveIndexInsteadColumn;

    private static String keepPlayerEnteredPositions[][] = new String[3][3];

    Elements(int row, String column, String playWithX_O) {
        this.row = row;
        replaceLetterWithNum(column);
        this.startWith = playWithX_O;
        this.computerPlayWith = playWithX_O.equals("X") ? (this.computerPlayWith = this.getStartWithO())
                : (this.computerPlayWith = this.getStartWithX());
    }



    private void replaceLetterWithNum(String column) {

        if (column.equals("A")) {
            setSaveIndexInsteadColumn(0);
        } else if (column.equals("B")) {
            setSaveIndexInsteadColumn(1);
        } else if (column.equals("C")) {
            setSaveIndexInsteadColumn(2);
        }
    }

    public static void getRidOfNullElements() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                keepPlayerEnteredPositions[i][j] = " ";
            }
        }
    }

    public String getStartWithX() {
        return startWithX;
    }

    public String getStartWithO() {
        return startWithO;
    }

    public static String[][] getKeepPlayerEnteredPositions() {
        return keepPlayerEnteredPositions;
    }

    public int getSaveIndexInsteadColumn() {
        return saveIndexInsteadColumn;
    }

    public void setSaveIndexInsteadColumn(int saveIndexInsteadColumn) {
        this.saveIndexInsteadColumn = saveIndexInsteadColumn;
    }

    public String getComputerPlayWith() {
        return computerPlayWith;
    }

    public int getRow() {
        return row;
    }
}


//getRidOfNullElements bunu costructorun icinde yaratmaq lazimdir, static keyword-dan da 100 -100 yerde istifade edence
// istifade etmek olar ve 1 defe ucun static-e ehtiyac yoxdur