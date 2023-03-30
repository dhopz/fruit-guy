package fruitguy.Katas.Integers;

public class Fibonacci {
//    public static int fibonacci(int n){
//        //https://www.codewars.com/kata/5779f894ec8832493f00002d
//        if (n == 0) {
//            return 0;
//        } else if (n==1) {
//            return 1;
//        } else {
//            //return fibonacci(n-1) + fibonacci(n - 2);
//            int prev1 = 0;
//            int prev2 = 1;
//            int current = 0;
//            for (int i = 2; i<=n; i++){
//                current = prev1 + prev2;
//                prev1 = prev2;
//                prev2 = current;
//            }
//            System.out.println(current);
//            System.out.println("last digit " + current % 10);
//            return current;
//        }
//    }

    public static int fibonacci(int n){
        if (n<= 1) {
            return n;
        } else {
            int a = 0, b = 1, c = 0;
            for (int i = 2; i <= n; i++){
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
            return c;
        }
    }

    public static void countDigits(int number){
        int[] digitCounts = new int[10];
//        System.out.println(Arrays.toString(digitCounts));
        while(number > 0){
            int digit = number % 10;
            System.out.println(digit);
            digitCounts[digit]++;
            number/= 10;
        }
        for (int i =0; i < digitCounts.length; i++){
            System.out.println("Digit " + i + ": " + digitCounts[i] + " occurence");
        }
    }
}
