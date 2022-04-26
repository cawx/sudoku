public class Sudoku {
    // Koik vajaminevad funktsioonid siin
    int[][] game;
    int validNumber;
    public Sudoku(int[][] game) {
        this.game = game;
    }

    public void printSudoku() {
        for(int i = 0; i < game.length; i++) {
            if(i % 3 == 0 && i != 0) {
                System.out.println("");
                System.out.println("------------------");
            } else {
                System.out.println("");
            }
            for(int j = 0; j < game.length; j++) {
                if(j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(game[i][j]);
                System.out.print(" ");
            }
            
            
        }
    }

    public void solveSudoku() {
        for(int i = 0; i < game.length; i++) {
            for(int j = 0; j < game.length; j++) {
                if(game[i][j] == 0) {
                    for(int k = 1; k < game.length + 1; k++) {
                        if(isValid(k, i, j)) {
                            game[i][j] = k;
                        }
                    }
                }
            }
        }
        printSudoku();
    }

    public boolean isValid(int number, int row, int col) {
        boolean rowContain = doesContain(number, getRow(row));
        boolean colContain = doesContain(number, getCol(col));
        boolean boxContain = doesContain(number, getBox(row, col));
        /*System.out.println("box " + boxContain);
        System.out.println("row " + rowContain);
        System.out.println("col " + colContain);*/
        if(rowContain == false && colContain == false && boxContain == false) {
            return true;
        } else {
            return false;
        }
        
    }

    // Get row numbers
    public int[] getRow(int rowNr) {
        int[] rowNumbers = new int[9];
        for(int i = 0; i < game.length; i++) {
            rowNumbers[i] = game[rowNr][i];
        }
        return rowNumbers;
    }
    // Get column numbers
    public int[] getCol(int colNr) {
        int[] colNumbers = new int[9];
        for(int i = 0; i < game.length; i++) {
            colNumbers[i] = game[i][colNr];
        }
        return colNumbers; 
    }
    // Get box numbers
    public int[] getBox(int x, int y) {
        int[] boxNumbers = new int[9];
        int counter = 0;
        // Leian kastis oleva esimese numbri koordinaadid
        int xRemainder = x % 3;
        int yRemainder= y % 3;
        x = x - xRemainder;
        y = y - yRemainder;
        for(int i = x; i < x + 3; i++) {
            for(int j = y; j < y + 3; j++) {
                boxNumbers[counter] = game[i][j];
                counter++;
            }
        }
        return boxNumbers;
    }

    public boolean doesContain(int number, int[] array) {
        boolean contains = false;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == number) {
                contains = true;
            }
        }
        return contains;
    }
}