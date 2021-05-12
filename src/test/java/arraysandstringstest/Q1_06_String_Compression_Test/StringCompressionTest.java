package arraysandstringstest.Q1_06_String_Compression_Test;
import arraysandstrings.Q1_06_String_Compression.StringCompression;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCompressionTest {

    private static StringCompression stringCompression;

    @BeforeAll
    public static void setUpStringCompression() {
        stringCompression = new StringCompression();
    }

    @Test
    void compressString_allUniqueChars_returnsInputStringUnchanged() {
        String testStr = "abcdefghijklmnopqrstuvwxyz";

        assertEquals(
                testStr,
                stringCompression.compressString(testStr)
        );
    }

    @Test
    void compressString_allLowercaseString_returnsCompressedString() {
        String testStr = "aabccccaa";
        String expectedResult = "a2b1c4a2";

        assertEquals(
                expectedResult,
                stringCompression.compressString(testStr)
        );
    }
}
