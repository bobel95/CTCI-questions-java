package linkedlists.Q2_02_Kth_To_Last;

import linkedlists.SinglyLinkedList;

public class KthToLast {

//  Implement an algorithm to find the kth to last element of a singly linked list.
    public int getKthToLast(int k, SinglyLinkedList<Integer> node) {
        var pointer = node;
        var slowPtr = node;

        int count = 1;

        while (pointer.hasNext()) {
            pointer = pointer.next();
            if (count == k) {
                slowPtr = slowPtr.next();
            } else {
                count++;
            }
        }

        return slowPtr.getVal();
    }
}


