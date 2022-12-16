package fruitguy;


import java.util.*;

import static fruitguy.Katas.removeLowestHighets.sum;


public class App {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9})));
        System.out.println(Arrays.toString(pipeFix(new int[]{6, 9})));


    }

    public static int[] pipeFix(int[] numbers) {
        int[] result = new int[numbers[numbers.length-1] + 1 - numbers[0]];
        result[0] = numbers[0];

        for (int a = 1; a<(numbers[numbers.length-1] + 1 - numbers[0]); a++) {
            result[a] = result[a-1] + 1;
        }

        return result;
    }



}



