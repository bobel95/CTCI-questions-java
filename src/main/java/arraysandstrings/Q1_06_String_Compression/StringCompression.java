package arraysandstrings.Q1_06_String_Compression;

// Implement a method to perform basic string compression using the counts of repeated characters.
// For example, the string aabcccccaaa would become a2blc5a3.
// If the "compressed" string would not become smaller than the original string,
// your method should return the original string.
// You can assume the string has only uppercase and lowercase letters (a - z).
public class StringCompression {

    public String compressString(String s) {
        var result = new StringBuilder();

        int duplicates = 0;
        for (int i = 0; i < s.length(); i++) {
            duplicates++;

            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                result.append(s.charAt(i));
                result.append(duplicates);
                duplicates = 0;
            }
        }

        return result.toString().length() >= s.length()
                ? s
                : result.toString();
    }
}
