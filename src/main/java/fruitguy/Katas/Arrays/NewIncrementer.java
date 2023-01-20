package fruitguy.Katas.Arrays;

import org.jetbrains.annotations.NotNull;

public class NewIncrementer {
    public static int[] incrementerBestSolution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + i + 1) % 10;
        }
        return numbers;
    }

    public static int [] incrementer(int[] numbers) {
        int[] newNum = new int[numbers.length];
        for (int i = 1; i < numbers.length+1; i++){
            if (numbers[i-1]+i >= 10){
                newNum[i-1] = (numbers[i-1]+i) % 10;
            } else {
                newNum[i-1]= numbers[i-1]+i;
            }
        }
        return newNum;
    }
}
