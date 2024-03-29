package fruitguy.Katas.WhileLoop;
//https://www.codewars.com/kata/5635e7cb49adc7b54500001c/java

public class Atm {
    public int bestSolution(int n) {
        int[] denominations = new int[]{500, 200, 100, 50, 20, 10};
        int result = 0;

        for (int denomination: denominations) {
            result += n / denomination;
            n %= denomination;
        }

        return n == 0 ? result : -1;
    }
    public static int solution(int n) {
        int counter = 0;
        int newSum = n;

        while (newSum != 0) {
            if (n%10 != 0) {
                return -1;
            } else if (newSum >= 500) {
                counter = counter + (n / 500);
                newSum = newSum - (counter * 500);
            } else if (newSum >= 200) {
                counter = counter + (newSum / 200);
                newSum = newSum - ((newSum / 200) * 200);
            } else if (newSum >= 100) {
                counter = counter + (newSum / 100);
                newSum = newSum - ((newSum / 100) * 100);
            } else if (newSum >= 50) {
                counter = counter + (newSum / 50);
                newSum = newSum - ((newSum / 50) * 50);
            } else if (newSum >= 20) {
                counter = counter + (newSum / 20);
                newSum = newSum - ((newSum / 20) * 20);
            } else if (newSum >= 10) {
                counter = counter + (newSum / 10);
                newSum = newSum - ((newSum / 10) * 10);
            }

        }


        return counter;


    }
}
