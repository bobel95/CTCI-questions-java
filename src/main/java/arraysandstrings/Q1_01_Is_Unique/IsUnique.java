package arraysandstrings.Q1_01_Is_Unique;


import java.util.Set;
import java.util.stream.Collectors;

// Implement an algorithm to determine if a string has all unique characters.
public class IsUnique {

    public boolean areAllCharsUnique(String s) {

        Set<Character> uniqueStringChars = s
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
        return uniqueStringChars.size() == s.length();
    }

    // What if you can't use additional data structures?
    public boolean areAllCharsUniqueAlt(String s) {

        for (int i = 0; i < s.length(); i++) {
            char charA = s.charAt(i);

            for (int j = 0; j < s.length(); j++) {

                if (i == j) continue;

                char charB = s.charAt(j);
                if (charA == charB) {
                    return false;
                }
            }
        }

        return true;
    }
}
