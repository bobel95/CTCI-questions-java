package arraysandstrings.Q1_04_Palindrome_Permutation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Given a string, write a function to check if it is a permutation of a palindrome.
// A palindrome is a word or phrase that is the same forwards and backwards.
// A permutation is a rearrangement of letters.
// The palindrome does not need to be limited to just dictionary words
public class PalindromePermutation {

    public boolean isPalindromePermutation(String s) {

        List<Character> strChars = s
                .toLowerCase()
                .replaceAll("\\s+", "")
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        Set<Character> strUniqueChars = new HashSet<>(strChars);

        if (strChars.size() % 2 == 0) {
            return strChars.size() / 2 == strUniqueChars.size();
        }

        return strChars.size() / 2 + 1 == strUniqueChars.size();
    }
}
