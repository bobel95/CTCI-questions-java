package arraysandstringstest.Q1_01_Is_Unique_Test;

import arraysandstrings.Q1_01_Is_Unique.IsUnique;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsUniqueTest {

    private static IsUnique isUnique;

    @BeforeAll
    public static void setUpIsUnique() {
        isUnique = new IsUnique();
    }

    @Test
    void areAllCharsUnique_stringWithUniqueChars_returnsTrue() {
        String testStr = "abcdefgh";

        assertTrue(isUnique.areAllCharsUnique(testStr));
    }

    @Test
    void areAllCharsUnique_stringWithoutUniqueChars_returnsFalse() {
        String testStr = "aaaabcdefgh";

        assertFalse(isUnique.areAllCharsUnique(testStr));
    }

    @Test
    void areAllCharsUniqueAlt_stringWithUniqueChars_returnsTrue() {
        String testStr = "abcdefgh";

        assertTrue(isUnique.areAllCharsUniqueAlt(testStr));
    }

    @Test
    void areAllCharsUniqueAlt_stringWithoutUniqueChars_returnsFalse() {
        String testStr = "aaaabcdefgh";

        assertFalse(isUnique.areAllCharsUniqueAlt(testStr));
    }
}
