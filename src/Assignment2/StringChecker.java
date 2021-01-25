package Assignment2;

import java.util.Arrays;

public class StringChecker {
    /* Time Complexity      -  in terms of big O -->O(len(input))
    Space complexity    -  in terms of big O -->O(26) or O(1)
    */
    static boolean areAllAlphabetsPresent(String inputString) {

        inputString = inputString.toLowerCase();
        inputString = inputString.replaceAll("[^a-z]", "");
        boolean allAlphabets[] = new boolean[26];
        Arrays.fill(allAlphabets, false);
        for (char ch : inputString.toCharArray()) {
            allAlphabets[ch - 'a'] = true;
        }
        for (boolean b : allAlphabets) {
            if (b == false)
                return false;
        }
        return true;
    }
}