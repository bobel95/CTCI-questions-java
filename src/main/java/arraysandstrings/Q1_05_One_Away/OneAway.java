package arraysandstrings.Q1_05_One_Away;

import java.util.HashMap;
import java.util.Map;

// There are three types of edits that can be performed on strings:
// insert a character, remove a character, or replace a character.
// Given two strings, write a function to check if they are one edit (or zero edits) away.
public class OneAway {

    public boolean isOneAway(String a, String b) {
        if (a.equals(b)) {
            return true;
        }

        int differences = countDifferences(a, b);

        if (differences <= 1) {
            return true;
        }

        return false;
    }

    private Map<Character, Integer> getCharFrequencyMap(String s) {
        Map<Character, Integer> aCharFrequency = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (aCharFrequency.containsKey(c)) {
                aCharFrequency.put(c, aCharFrequency.get(c) + 1);
            } else {
                aCharFrequency.put(c, 1);
            }
        }

        return aCharFrequency;
    }

    private int countDifferences(String s1, String s2) {
        var s1CharFrequency = getCharFrequencyMap(s1);
        var s2CharFrequency = getCharFrequencyMap(s2);

        int differenceCount = 0;

        for (Character c : s1CharFrequency.keySet()) {

            int s1CharCount = s1CharFrequency.get(c);
            int s2CharCount = s2CharFrequency.getOrDefault(c, 0);

            if (s1CharCount != s2CharCount) {
                differenceCount++;
            }
        }

        return differenceCount;
    }
}
