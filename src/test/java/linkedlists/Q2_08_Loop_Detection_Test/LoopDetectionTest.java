package linkedlists.Q2_08_Loop_Detection_Test;

import linkedlists.Q2_08_LoopDetection.LoopDetection;
import linkedlists.SinglyLinkedList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LoopDetectionTest {

    private static LoopDetection loopDetection;

    @BeforeAll
    public static void setUpLoopDetection() {
        loopDetection = new LoopDetection();
    }

    @Test
    void detectLoopNode_listWithLoop_returnsLoopStartNode() {
        var testList = new SinglyLinkedList<Integer>();
        testList.addAll(List.of(1, 2, 3, 4, 5));

        var loopNode = new SinglyLinkedList<Integer>(6);
        loopNode.setNext(new SinglyLinkedList(7));
        var temp = loopNode;
        temp = loopNode.next();
        temp.setNext(loopNode);

        temp = testList;
        SinglyLinkedList<Integer> testListTail = null;

        while (temp.hasNext()) {
            temp = temp.next();
            testListTail = temp;
        }

        testListTail.setNext(loopNode);

        assertSame(loopNode, loopDetection.detectLoopNode(testList));
    }

    @Test
    void detectLoopNode_listWithoutLoop_returnsNull() {
        var testList = new SinglyLinkedList<Integer>();
        testList.addAll(List.of(1, 2, 3, 4, 5));

        assertNull(loopDetection.detectLoopNode(testList));
    }
}
