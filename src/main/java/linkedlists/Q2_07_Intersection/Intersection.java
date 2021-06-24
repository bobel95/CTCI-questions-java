package linkedlists.Q2_07_Intersection;

import linkedlists.SinglyLinkedList;

// Given two (singly) linked lists, determine if the two lists intersect.
// Return the intersecting node.
// Note that the intersection is defined based on reference, not value.
// That is, if the kth node of the first linked list is the exact same node (by reference)
// as the jth node of the second linked list, then they are intersecting.
public class Intersection {

    public SinglyLinkedList<Integer> getIntersection(SinglyLinkedList<Integer> listA, SinglyLinkedList<Integer> listB) {

        int lenA = getSize(listA);
        int lenB = getSize(listB);

        var tailA = getTail(listA);
        var tailB = getTail(listB);

        if (tailA != tailB) {
            return null;
        }

        var shorterList = lenA < lenB ? listA : listB;
        var longerList = lenA < lenB ? listB : listA;

        int lenDiff = Math.abs(lenA - lenB);
        while(lenDiff > 0) {
            longerList = longerList.next();
            lenDiff--;
        }

        while (shorterList != longerList) {
            shorterList = shorterList.next();
            longerList = longerList.next();
        }

        return shorterList;
    }

    private int getSize(SinglyLinkedList<?> list) {
        int len = 1;
        while (list.hasNext()) {
            list = list.next();
            len++;
        }

        return len;
    }

    private SinglyLinkedList<Integer> getTail(SinglyLinkedList<Integer> list) {
        while (list.hasNext()) {
            list = list.next();
        }
        return list;
    }
}
