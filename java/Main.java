import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] game = {
            {0, 0, 0, 2, 6, 0, 7, 0, 1},
            {6, 8, 0, 0, 7, 0, 0, 9, 0},
            {1, 9, 0, 0, 0, 4, 5, 0, 0},
            {8, 2, 0, 1, 0, 0, 0, 4, 0},
            {0, 0, 4, 6, 0, 2, 9, 0, 0},
            {0, 5, 0, 0, 0, 3, 0, 2, 8},
            {0, 0, 9, 3, 0, 0, 0, 7, 4},
            {0, 4, 0, 0, 5, 0, 0, 3, 6},
            {7, 0, 3, 0, 1, 8, 0, 0, 0}
        };
        Sudoku sudoku = new Sudoku(game);
        //sudoku.printSudoku();
        //sudoku.solveSudoku();
        
        //System.out.println(Arrays.toString(sudoku.getRow(6)));
        //System.out.println(Arrays.toString(sudoku.getCol(4)));
        System.out.println(Arrays.toString(sudoku.getBox(6, 4)));
        System.out.println(Arrays.toString(sudoku.getRow(6)));
        System.out.println(Arrays.toString(sudoku.getCol(4)));
        System.out.println(sudoku.isValid(1, 6, 4));
        sudoku.solveSudoku();
    }
}