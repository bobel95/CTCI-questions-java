package linkedlists.Q2_07_Intersection;

import linkedlists.SinglyLinkedList;

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
