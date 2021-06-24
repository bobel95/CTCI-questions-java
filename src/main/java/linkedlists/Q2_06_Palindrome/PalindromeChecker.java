package linkedlists.Q2_06_Palindrome;

import linkedlists.SinglyLinkedList;

import java.util.List;

//Implement a function to check if a linked list is a palindrome.
public class PalindromeChecker {

    public boolean isPalindrome(SinglyLinkedList<Integer> list) {

        var reversedList = reverseList(list);
        while (reversedList != null && list != null) {
            if (reversedList.getVal() != list.getVal()) {
                return false;
            }
            reversedList = reversedList.next();
            list = list.next();
        }

        return true;
    }

    public static SinglyLinkedList<Integer> reverseList(SinglyLinkedList<Integer> node) {

        SinglyLinkedList<Integer> curr = null;

        while (node != null) {
            SinglyLinkedList<Integer> n = new SinglyLinkedList<>(node.getVal());
            n.setNext(curr);
            curr = n;
            node = node.next();
        }

        return curr;
    }
}
