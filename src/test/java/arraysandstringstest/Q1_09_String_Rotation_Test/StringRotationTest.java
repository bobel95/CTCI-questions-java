package arraysandstringstest.Q1_09_String_Rotation_Test;

import arraysandstrings.Q1_09_String_Rotation.StringRotation;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StringRotationTest {

    private static StringRotation stringRotation;

    @BeforeAll
    public static void setUpStringRotation() {
        stringRotation = new StringRotation();
    }

    @Test
    void isRotation_rotationInput_returnsTrue() {
        String testStr1 = "waterbottle";
        String testStr2 = "erbottlewat";

        assertTrue(
                stringRotation.isRotation(testStr1, testStr2)
        );
    }

    @Test
    void isRotation_notRotationInput_returnsTrue() {
        String testStr1 = "waterbottle";
        String testStr2 = "bttleowater";

        assertFalse(
                stringRotation.isRotation(testStr1, testStr2)
        );
    }
}

