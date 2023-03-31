package fruitguy;

import java.util.Arrays;

import static fruitguy.Katas.Arrays.SortOdds.sortOddNumbers;

public class App {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortOddNumbers(new int[]{5, 3, 1, 8, 0}))); //1, 3, 5, 8, 0
        System.out.println(Arrays.toString(sortOddNumbers(new int[]{5, 3, 2, 8, 1, 4}))); // 1, 3, 2, 8, 5, 4

    }

}



