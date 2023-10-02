package fruitguy;

import java.util.Arrays;

import static fruitguy.Katas.Strings.LongWord.longestWord;

public class App {
    public static void main(String[] args) {
//        System.out.println(nextSmallerInteger(21));
        int num = 2071;
        int result = nextSmallerInteger(num);
        System.out.println("Next smaller integer with the same digits as " + num + " is: " + result);


    }
    public static int nextSmallerInteger(long n) {
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

    public static int nextSmallerIntegerTry(int num) {
        // Convert the integer to a string to work with its digits
        String numStr = Integer.toString(num);
        char[] digits = numStr.toCharArray();

        // Step 1: Find the first pair of adjacent digits where the left digit is smaller than the right digit
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // If no such pair is found, the number is already the smallest possible
        if (i == -1) {
            return num;
        }

        // Step 2: Find the smallest digit to the right of 'i' that is greater than digits[i]
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Step 3: Swap digits[i] and digits[j]
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Step 4: Sort all digits to the right of digits[i] in ascending order
        Arrays.sort(digits, i + 1, digits.length);

//        Arrays.sort(digits, i + 1, digits.length);
//        for (int start = i + 1, end = digits.length - 1; start < end; start++, end--) {
//            char temp2 = digits[start];
//            digits[start] = digits[end];
//            digits[end] = temp2;
//        }

        // Step 5: Convert the modified string back to an integer and return it
        return Integer.parseInt(new String(digits));
    }

}











