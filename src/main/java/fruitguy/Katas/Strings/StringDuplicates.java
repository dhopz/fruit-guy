package fruitguy.Katas.Strings;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicates {
    public static int countDuplicates( String input) {
        //https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/java
        int alphaCount = 0;
        int digitCount = 0;

        Map<Character, Integer> charCounts = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.toLowerCase().charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                continue;
            }
            int count = charCounts.getOrDefault(c, 0);
            charCounts.put(c, count + 1);
            if (count == 1) {
                if (Character.isLetter(c)) {
                    alphaCount++;
                } else {
                    digitCount++;
                }
            }
        }
        return alphaCount + digitCount;
    }
}
