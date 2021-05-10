package arraysandstringstest.Q1_05_One_Away_Test;

import arraysandstrings.Q1_05_One_Away.OneAway;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OneAwayTest {

    private static OneAway oneAway;

    @BeforeAll
    public static void setUpOneAway() {
        oneAway = new OneAway();
    }

    @Test
    void isOneAway_oneInsertionAway_returnsTrue() {
        String testS1 = "pale";
        String testS2 = "ple";

        assertTrue(
                oneAway.isOneAway(testS1, testS2)
        );
    }

    @Test
    void isOneAway_oneReplacementAway_returnTrue() {
        String testS1 = "pale";
        String testS2 = "bale";

        assertTrue(
                oneAway.isOneAway(testS1, testS2)
        );
    }

    @Test
    void isOneAway_oneRemovalAway_returnTrue() {
        String testS1 = "pale";
        String testS2 = "pales";

        assertTrue(
                oneAway.isOneAway(testS1, testS2)
        );
    }

    @Test
    void isOneAway_notOneAway_returnFalse() {
        String testS1 = "pale";
        String testS2 = "bae";

        assertFalse(
                oneAway.isOneAway(testS1, testS2)
        );
    }

}
