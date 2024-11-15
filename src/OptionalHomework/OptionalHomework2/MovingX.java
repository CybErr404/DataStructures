package OptionalHomework.OptionalHomework2;

public class MovingX {
    private int rowsN;
    private int columnsM;

    public MovingX() {
        rowsN = 0;
        columnsM = 0;
    }

    public MovingX(int rowAmount, int columnAmount) {
        rowsN = rowAmount;
        columnsM = columnAmount;
    }

    public void forLoopGrid() {
        int x = 0;
        int y = 0;
        System.out.println("Running the forLoopGrid() method: ");
        if (rowsN == 0 && columnsM == 0) {
            System.out.println("Please enter the number of rows and columns into the constructor before continuing.");
        }
        for(int numTimes = 0; numTimes < (rowsN * columnsM); numTimes++) {
            for (int i = 0; i < rowsN; i++) {
                for (int j = 0; j < columnsM; j++) {
                    if (i == x && j == y) {
                        System.out.print("[X]");
                    } else {
                        System.out.print("[ ]");
                    }
                }
                System.out.println();
            }
            if (x < rowsN) {
                x++;
            } else {
                x = 0;
                y++;
            }
            System.out.println();
        }
    }

    public void arrayGrid() {
        System.out.println("Running the arrayGrid() method: ");
    }
}
