package linkedlists.Q2_07_Intersection_Test;

import linkedlists.Q2_07_Intersection.Intersection;
import linkedlists.SinglyLinkedList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class IntersectionTest {

    private static Intersection intersection;

    @BeforeAll
    public static void setUpIntersection() {
        intersection = new Intersection();
    }

    @Test
    void getIntersection_intersectingLists_returnsNode() {
        var testListA = new SinglyLinkedList<Integer>();
        testListA.addAll(List.of(1, 2, 3, 4, 5, 6, 7));

        var testListB = new SinglyLinkedList<Integer>();
        testListB.addAll(List.of(3, 4, 5, 6, 7));

        var tail = new SinglyLinkedList<Integer>();
        tail.addAll(List.of(8, 9, 10));

        var temp = testListA;
        SinglyLinkedList<Integer> tailA = null;
        while(temp.hasNext()) {
            temp = temp.next();
            tailA = temp;
        }

        temp = testListB;
        SinglyLinkedList<Integer> tailB = null;
        while(temp.hasNext()) {
            temp = temp.next();
            tailB = temp;
        }

        tailA.setNext(tail);
        tailB.setNext(tail);

        assertSame(
                tail,
                intersection.getIntersection(testListA, testListB)
        );
    }

    @Test
    void getIntersection_noIntersection_returnsNull() {
        var testListA = new SinglyLinkedList<Integer>();
        testListA.addAll(List.of(1, 2, 3, 4, 5, 6, 7));

        var testListB = new SinglyLinkedList<Integer>();
        testListB.addAll(List.of(3, 4, 5, 6, 7));

        assertNull(intersection.getIntersection(testListA, testListB));
    }

}
