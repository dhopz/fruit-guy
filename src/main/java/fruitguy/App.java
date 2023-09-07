package fruitguy;

import java.util.Arrays;

import static fruitguy.Katas.Arrays.Spacey.spacey;

public class App {
    public static void main(String[] args) {
        System.out.println(ATM(770));
        System.out.println(ATM(238));

    }

    public static int ATM(int n) {
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }

//        if(n % 500 == 0){
//            System.out.println("this ");
//            counter ++;
//        } else {
//            System.out.println("divisible");
//            counter ++;
//        }
//        System.out.println(n % 500);

        // Variable to store the counter
        int counter = 0;

        // Running a loop from A to B and check
        // if a number is divisible by M.
        int newNumber = n;
        for (int i = 0; i <= n; i++)
            if (i % 500 == 0)
                newNumber = newNumber - 500;
                counter++;

        return counter;




    }








}



