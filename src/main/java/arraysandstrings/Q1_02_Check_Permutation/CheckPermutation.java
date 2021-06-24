package arraysandstrings.Q1_02_Check_Permutation;

import java.util.Arrays;

// Given two strings, write a method to decide if one is a permutation of the other.
public class CheckPermutation {

    public int findPermutations(String a, String b) {
        String sortedA = sortString(a);
        int result = 0;

        for (int i = 0; i < b.length() - a.length() + 1; i ++) {
            StringBuilder bPart = new StringBuilder();
            for (int j = 0; j < a.length(); j++) {
                bPart.append(b.charAt(i + j));
            }
            String sortedBPart = sortString(bPart.toString());
            if (sortedA.equals(sortedBPart)) {
                result++;
            }
        }

        return result;
    }

    private String sortString(String s) {
        char[] tempArr = s.toCharArray();
        Arrays.sort(tempArr);
        return new String(tempArr);
    }
}
