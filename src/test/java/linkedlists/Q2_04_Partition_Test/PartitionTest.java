package linkedlists.Q2_04_Partition_Test;
import linkedlists.Q2_04_Partition.Partition;
import linkedlists.SinglyLinkedList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class PartitionTest {

    private static Partition partition;

    @BeforeAll
    public static void setUpPartition() {
        partition = new Partition();
    }

    @Test
    void partition_shuffledList_returnsPartitionedList() {

        var testList = new SinglyLinkedList<Integer>();
        testList.addAll(List.of(2, 7, 3, 5, 8, 10));

        assertEquals(
                "[ 2, 3, 5, 7, 8, 10 ]",
                partition.partition(testList, 7).toString()
        );
    }
}
