package linkedlists.Q2_06_Palindrome_Test;
import linkedlists.Q2_06_Palindrome.PalindromeChecker;
import linkedlists.SinglyLinkedList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    private static PalindromeChecker palindromeChecker;

    @BeforeAll
    public static void setUpPalindromeChecker() {
        palindromeChecker = new PalindromeChecker();
    }

    @Test
    void isPalindrome_palindromeLinkedList_returnsTrue() {
        var testList = new SinglyLinkedList<Integer>();
        testList.addAll(List.of(1, 2, 3, 2, 1));

        assertTrue(palindromeChecker.isPalindrome(testList));
    }

    @Test
    void isPalindrome_notPalindromeLinkedList_returnsFalse() {
        var testList = new SinglyLinkedList<Integer>();
        testList.addAll(List.of(1, 2, 3, 4, 5));

        assertFalse(palindromeChecker.isPalindrome(testList));
    }

}
