package arraysandstringstest.Q1_08_Zero_Matrix_Test;

import arraysandstrings.Q1_08_Zero_Matrix.ZeroMatrix;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ZeroMatrixTest {

    private static ZeroMatrix zeroMatrix;

    @BeforeAll
    public static void setUpZeroMatrix() {
        zeroMatrix = new ZeroMatrix();
    }

    @Test
    void zeroMatrix_1zeroInMatrix_nullifiesRowAndCol() {
        int[][] testMatrix = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 0}
        };

        int[][] expectedResult = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 0}
        };

        zeroMatrix.zeroMatrix(testMatrix);

        assertArrayEquals(
                expectedResult,
                testMatrix
        );
    }


    @Test
    void zeroMatrix_multipleZerosInMatrix_nullifiesRowAndCol() {
        int[][] testMatrix = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 1}
        };

        int[][] expectedResult = {
                {0, 0, 0, 0},
                {0, 1, 0, 1},
                {0, 0, 0, 0}
        };

        zeroMatrix.zeroMatrix(testMatrix);

        assertArrayEquals(
                expectedResult,
                testMatrix
        );
    }
}
