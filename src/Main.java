import java.io.File;

public class Main {

    public static void main(String[] args) {
        Sudoku.CSP csp = new Sudoku.CSP();
        csp = Sudoku.createSudokuCSP("boards/easy.txt");

        Sudoku.printSudokuSolution(csp.backtrackingSearch());
    }
}
