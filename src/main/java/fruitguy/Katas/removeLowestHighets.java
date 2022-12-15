package fruitguy.Katas;

import java.util.Arrays;

public class removeLowestHighets {
    public static int sum(int[] numbers){
        if (numbers == null || numbers.length <= 1){
            return 0;
        } else {
            Arrays.sort(numbers);
            int sumCount = 0;
            for (int i=1; i< numbers.length-1; i++){
                sumCount = sumCount + numbers[i];
            }
            return sumCount;
        }

    }
}
