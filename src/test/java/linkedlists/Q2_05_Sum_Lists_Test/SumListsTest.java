package linkedlists.Q2_05_Sum_Lists_Test;
import linkedlists.Q2_05_Sum_Lists.SumLists;
import linkedlists.SinglyLinkedList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SumListsTest {

    private static SumLists sumLists;

    @BeforeAll
    public static void setUpSumLists() {
        sumLists = new SumLists();
    }

    @Test
    void sumLinkedLists_3digitNums_returnsSum() {
        var listA = new SinglyLinkedList<Integer>();
        listA.addAll(List.of(7, 1, 6));

        var listB = new SinglyLinkedList<Integer>();
        listB.addAll(List.of(5, 9, 2));

        sumLists.sumLinkedLists(listA, listB);

        assertEquals(
                "[ 2, 1, 9 ]",
                sumLists.sumLinkedLists(listA, listB).toString()
        );
    }
}
