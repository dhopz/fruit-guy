package fruitguy.Katas.Arrays;

import java.util.Arrays;

public class SortOdds {
    //https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/java
    public static int[] sortOddNumbers(int[] arr){
        int odds = 0;
        for(int i = 0; i< arr.length;i++){
            if (arr[i] % 2 != 0 && arr[i] != 0){
                odds++;
            }
        }

        int[]oddNums = new int[odds];
        int index = 0;

        for (int i = 0; i< arr.length;i++){
            if(arr[i]%2 !=0 && arr[i] != 0){
                oddNums[index] = arr[i];
                index++;
            }
        }

        Arrays.sort(oddNums);
        System.out.println(Arrays.toString(oddNums));

        index = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 != 0 && arr[i]!=0){
                arr[i] = oddNums[index];
                index++;
            }
        }
        return arr;
    }
}
