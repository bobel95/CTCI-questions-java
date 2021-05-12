package arraysandstringstest.Q1_07_Rotate_Matrix_Test;

import arraysandstrings.Q1_07_Rotate_Matrix.RotateMatrix;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RotateMatrixTest {

    private static RotateMatrix rotateMatrix;

    @BeforeAll
    public static void setUpRotateMatrix() {
        rotateMatrix = new RotateMatrix();
    }

    @Test
    void rotate90_2by2matrix_rotates90() {
        int[][] testMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int [][] expectedRes = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };

        rotateMatrix.rotate90(testMatrix);

        assertArrayEquals(
                expectedRes,
                testMatrix
        );
    }

    @Test
    void rotate90_3by3matrix_rotates90() {
        int[][] testMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int [][] expectedRes = {
                {13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}
        };

        rotateMatrix.rotate90(testMatrix);

        assertArrayEquals(
                expectedRes,
                testMatrix
        );
    }
}
