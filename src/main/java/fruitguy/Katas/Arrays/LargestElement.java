package fruitguy.Katas.Arrays;

import java.util.Arrays;

public class LargestElement {
    public static int[] largest(int n, int[] arr) {
//        https://www.codewars.com/kata/53d32bea2f2a21f666000256/java
        Arrays.sort(arr);
        int[] result = new int[n];
        int j = 0;

        for (int i = arr.length -1; i>= arr.length - n; i--){
            result[j] = arr[i];
            j++;
        }
        Arrays.sort(result);
        return result;
    }
}
