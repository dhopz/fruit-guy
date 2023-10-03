package fruitguy.Katas.Strings;

import java.util.Arrays;

public class NextInt {
    public static int nextSmallerIntegerTry(long n) {
        //https://www.codewars.com/kata/5659c6d896bc135c4c00021e/train/java
        int num = (int) n;
        String numStr = Integer.toString(num);

        if (numStr.length() < 2) {
            return -1;
        }

        String lastTwoDigits = numStr.substring(numStr.length() - 2);

        String swappedNumStr = numStr.substring(0, numStr.length() - 2) + lastTwoDigits.charAt(1) + lastTwoDigits.charAt(0);

        int swappedNum = Integer.parseInt(swappedNumStr);

        if (swappedNum < num) {
            return swappedNum;
        } else {
            return -1;
        }
    }

    public static int nextSmallestInteger(int num) {
        // Convert the integer to a string for easier manipulation
        String numStr = Integer.toString(num);
        char[] digits = numStr.toCharArray();

        // Find the first pair of adjacent digits where the left digit is greater than the right digit
        int i = digits.length - 2;
        while (i >= 0 && digits[i] <= digits[i + 1]) {
            i--;
        }

        // If no such pair is found, it's not possible to find a smaller integer
        if (i == -1) {
            return -1; // or any other value to indicate that no smaller integer exists
        }

        // Find the largest digit to the right of digits[i] that is smaller than digits[i]
        int j = digits.length - 1;
        while (digits[j] >= digits[i]) {
            j--;
        }

        // Swap the two digits
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Sort all the digits to the right of digits[i] in descending order
        Arrays.sort(digits, i + 1, digits.length);

        // Convert the modified string back to an integer and return it
        return Integer.parseInt(new String(digits));
    }

}
