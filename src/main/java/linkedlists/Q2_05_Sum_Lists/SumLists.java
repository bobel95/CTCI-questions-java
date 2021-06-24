package linkedlists.Q2_05_Sum_Lists;

import linkedlists.SinglyLinkedList;

import java.util.ArrayList;
import java.util.List;

// You have two numbers represented by a linked list,
// where each node contains a single digit.
// The digits are stored in reverse order,
// such that the 1 's digit is at the head of the list.
// Write a function that adds the two numbers and returns the sum as a linked list.
// EXAMPLE
// Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is, 617 + 295.
// Output: 2 -> 1 -> 9. That is, 912.
public class SumLists {

    public SinglyLinkedList<Integer> sumLinkedLists(
            SinglyLinkedList<Integer> listA,
            SinglyLinkedList<Integer> listB) {

        int listANum = linkedListToReverseNum(listA);
        int listBNum = linkedListToReverseNum(listB);

        int sum = listANum + listBNum;

        String sumStr = String.valueOf(sum);
        List<Integer> temp = new ArrayList<>();

        for (int i = sumStr.length(); i > 0; i--) {
            temp.add(Integer.parseInt(sumStr.substring(i - 1, i)));
        }

        var res = new SinglyLinkedList<Integer>();
        res.addAll(temp);
        return res;
    }

    private int linkedListToReverseNum(SinglyLinkedList<Integer> list) {
        var currNode = list;
        int res = 0;
        int i = 1;

        while (currNode != null) {
            res += currNode.getVal() * i;

            i*=10;
            currNode = currNode.next();
        }

        return res;
    }
}
