package linkedlists.Q2_01_Remove_Dups_Test;

import static org.junit.jupiter.api.Assertions.*;

import linkedlists.Q2_01_Remove_Dups.RemoveDups;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RemoveDupsTest {

    private static RemoveDups removeDups;

    @BeforeAll
    private static void setUpRemoveDups() {
        removeDups = new RemoveDups();
    }

    @Test
    void removeDups_allDuplicates_removesAllButOne() {
        var testList = new LinkedList<>(List.of(1, 1, 1, 1, 1, 1, 1, 1));
        var expected = new LinkedList<>(List.of(1));

        removeDups.removeDups(testList);

        assertEquals(expected, testList);
    }

    @Test
    void removeDups_multipleDuplicates_removesAllDuplicates() {
        var testList = new LinkedList<>(List.of(1, 1, 1, 1, 2, 3, 1, 2));
        var expected = new LinkedList<>(List.of(1, 2, 3));

        removeDups.removeDups(testList);

        Collections.sort(testList);

        assertEquals(expected, testList);
    }

    @Test
    void removeDups_noDuplicates_doesNotModifyList() {
        var testList = new LinkedList<>(List.of(1, 2, 3, 4));
        var expected = new LinkedList<>(List.of(1, 2, 3, 4));

        removeDups.removeDups(testList);

        assertEquals(expected, testList);
    }
}
