package arraysandstrings.Q1_04_Palindrome_Permutation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
