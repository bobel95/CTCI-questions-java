package arraysandstrings.Q1_08_Zero_Matrix;


// Write an algorithm such that if an element in an MxN matrix is 0
// then its entire row and column are set to 0.
public class ZeroMatrix {

    public void zeroMatrix(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] zeroRows = new int[rows];
        int[] zeroCols = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = 1;
                    zeroCols[j] = 1;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            if (zeroRows[i] == 1) {
                nullifyRow(matrix, i);
            }
        }

        for (int j = 0; j < cols; j++) {
            if (zeroCols[j] == 1) {
                nullifyCol(matrix, j);
            }
        }
    }

    private void nullifyRow(int[][] matrix, int row) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
    }

    private void nullifyCol(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
}
