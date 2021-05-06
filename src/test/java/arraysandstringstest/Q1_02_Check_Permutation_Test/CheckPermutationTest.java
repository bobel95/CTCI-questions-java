package arraysandstringstest.Q1_02_Check_Permutation_Test;

import arraysandstrings.Q1_02_Check_Permutation.CheckPermutation;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CheckPermutationTest {

    private static CheckPermutation checkPermutation;

    @BeforeAll
    public static void setUpCheckPermutation() {
        checkPermutation = new CheckPermutation();
    }

    @Test
    void findPermutations_sevenPermutationsInput_returnsSeven() {
        String a = "abbc";
        String b = "cbabadcbbabbcbabaabccbabc";

        assertEquals(7, checkPermutation.findPermutations(a, b));
    }

    @Test
    void findPermutations_noPermutationsInput_returnsZero() {
        String a = "aaaa";
        String b = "bbbbbbbbbbbbbbbbbbb";

        assertEquals(0, checkPermutation.findPermutations(a, b));
    }

}
