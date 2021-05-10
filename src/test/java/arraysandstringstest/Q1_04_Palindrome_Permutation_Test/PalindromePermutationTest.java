package arraysandstringstest.Q1_04_Palindrome_Permutation_Test;

import arraysandstrings.Q1_04_Palindrome_Permutation.PalindromePermutation;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromePermutationTest {

    private static PalindromePermutation palindromePermutation;

    @BeforeAll
    public static void setUpPalindromePermutation() {
        palindromePermutation = new PalindromePermutation();
    }

    @Test
    void isPalindromePermutation_palindromeInput_returnsTrue() {
        String testStr = "Tact coa";

        assertTrue(
                palindromePermutation.isPalindromePermutation(testStr)
        );
    }

    @Test
    void isPalindromePermutation_notPalindromeInput_returnsFalse() {
        String testStr = "abc";

        assertFalse(
                palindromePermutation.isPalindromePermutation(testStr)
        );
    }
}
