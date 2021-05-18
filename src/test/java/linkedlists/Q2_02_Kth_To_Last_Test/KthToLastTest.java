package linkedlists.Q2_02_Kth_To_Last_Test;

import linkedlists.Q2_02_Kth_To_Last.KthToLast;
import linkedlists.SinglyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class KthToLastTest {

    private static KthToLast kthToLast;

    @BeforeAll
    public static void setUpKthToLast() {
        kthToLast = new KthToLast();
    }

    @Test
    void kthToLast_2ndToLast_returns2ndToLast() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addAll(List.of(1, 2, 3, 4, 5, 6));

        Assertions.assertEquals(
                4,
                kthToLast.getKthToLast(3, list)
        );
    }
}
