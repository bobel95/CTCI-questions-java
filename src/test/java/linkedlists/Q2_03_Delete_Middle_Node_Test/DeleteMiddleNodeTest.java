package linkedlists.Q2_03_Delete_Middle_Node_Test;
import linkedlists.Q2_03_Delete_Middle_Node.DeleteMiddleNode;
import linkedlists.SinglyLinkedList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DeleteMiddleNodeTest {

    private static DeleteMiddleNode deleteMiddleNode;

    @BeforeAll
    public static void setUpDeleteMiddleNode() {
        deleteMiddleNode = new DeleteMiddleNode();
    }

    @Test
    void deleteMiddleNode_validInput_removesGivenNode() {
        var testList = new SinglyLinkedList<Integer>();
        testList.addAll(List.of(1, 2, 3, 4));

        var testNode = testList.next().next();

        deleteMiddleNode.deleteMiddleNode(testNode);
        assertEquals(
                "[ 1, 2, 4 ]",
                testList.toString()
        );
    }
}
