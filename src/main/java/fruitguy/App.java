package fruitguy;

import java.util.HashMap;

import static fruitguy.Katas.Maps.NonRepeat.firstNonRepeated;

public class App {
    public static void main(String[] args) {
        System.out.println(firstNonRepeated("test"));
        int n = 10;
        int fibonacciNumber = fibonacci(n);
        countDigits(fibonacciNumber);
    }

    public static int fibonacci(int n){
        //https://www.codewars.com/kata/5779f894ec8832493f00002d
        if (n == 0) {
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n - 2);
        }
    }

    public static void countDigits(int number){
        int[] digitCounts = new int[10];
        while(number > 0){
            int digit = number % 10;
            digitCounts[digit]++;
            number/= 10;
        }
        for (int i =0; i < digitCounts.length; i++){
            System.out.println("Digit " + i + ": " + digitCounts[i] + " occurence");
        }
    }



}



