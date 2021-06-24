package linkedlists.Q2_08_LoopDetection;


// Given a circular linked list,
// implement an algorithm that returns the node at the beginning of the loop.
// DEFINITION
// Circular linked list: A (corrupt) linked list in which
// a node's next pointer points to an earlier node,
// so as to make a loop in the linked list.
// EXAMPLE
// Input: A - > B - > C - > D - > E - > C [the same C as earlier]
// Output: C

import linkedlists.SinglyLinkedList;

public class LoopDetection {

    public SinglyLinkedList<Integer> detectLoopNode(SinglyLinkedList<Integer> list) {

        var slowPtr = list;
        var fastPtr = list;

        while (fastPtr != null && fastPtr.hasNext()) {
            slowPtr = slowPtr.next();
            fastPtr = fastPtr.next().next();
            if (slowPtr == fastPtr) {
                break;
            }
        }

        if (fastPtr == null || !fastPtr.hasNext()) {
            return null;
        }

        slowPtr = list;
        while (slowPtr != fastPtr) {
            slowPtr = slowPtr.next();
            fastPtr = fastPtr.next();
        }

        return slowPtr;
    }

}
