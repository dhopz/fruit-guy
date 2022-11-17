package fruitguy.Katas;

import java.util.Arrays;

public class DescendingOrderDigit {
    public static int sortDesc(final int num) {
        String number = String.valueOf(num);
        char[] digits1 = number.toCharArray();
        Arrays.sort(digits1);
        return Integer.parseInt(new StringBuffer(new String(digits1)).reverse().toString());
    }
}
