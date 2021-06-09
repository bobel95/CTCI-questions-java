package linkedlists.Q2_04_Partition;

import linkedlists.SinglyLinkedList;

// Write code to partition a linked list around a value x,
// such that all nodes less than x come before all nodes greater than or equal to x.
// If x is contained within the list the values of x only need
// to be after the elements less than x (see below).
// The partition element x can appear anywhere in the "right partition";
// it does not need to appear between the left and right partitions.
// EXAMPLE
// Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
// Output: 3 -> 1 -> 2 -> 5 -> 5 -> 8 -> 10
public class Partition {

    public SinglyLinkedList<Integer> partition(SinglyLinkedList<Integer> list, Integer partNum) {
        var lessThanPartHead = new SinglyLinkedList<Integer>();
        var lessThanPartTail = lessThanPartHead;
        var biggerThanPartHead = new SinglyLinkedList<Integer>();
        var biggerThanPartTail = biggerThanPartHead;


        SinglyLinkedList<Integer> currNode = list;
        while (currNode != null) {

            if (currNode.getVal() < partNum) {
               lessThanPartTail.setNext(new SinglyLinkedList(currNode.getVal()));
               lessThanPartTail = lessThanPartTail.next();
            } else {
                biggerThanPartTail.setNext(new SinglyLinkedList(currNode.getVal()));
                biggerThanPartTail = biggerThanPartTail.next();
            }

            currNode = currNode.next();
        }

        lessThanPartTail.setNext(biggerThanPartHead.next());

        return lessThanPartHead.next();
    }
}
