package arraysandstringstest.Q1_03_URLify_Test;

import arraysandstrings.Q1_03_URLify.URLify;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class URLifyTest {

    private static URLify urlify;

    @BeforeAll
    public static void setUpURLify() {
        urlify = new URLify();
    }

    @Test
    void replaceSpaces_twoSpacesInput_shouldReplaceSpaces() {
        char[] testStr = "Mr John Smith    ".toCharArray();
        int trueSize = 13;

        urlify.replaceSpaces(testStr, trueSize);

        assertEquals(
                "Mr%20John%20Smith",
                new String(testStr)
        );

    }
}
