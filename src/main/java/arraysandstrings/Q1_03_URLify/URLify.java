package arraysandstrings.Q1_03_URLify;

public class URLify {
    public void replaceSpaces(char[] str, int trueLen) {
        int spaceCount = 0;
        int i = 0;
        int index;

        // count the spaces in the given string
        for (i = 0; i < trueLen; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        index = trueLen + spaceCount * 2;

        if (trueLen < str.length) {
            str[trueLen] = '\0';
        }

        for (i = trueLen - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
            } else {
                str [index - 1] = str[i];
                index--;
            }
        }
    }
}
