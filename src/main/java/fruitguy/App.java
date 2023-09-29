package fruitguy;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {
        int[] parts = new int[] {0, 1, 3, 6, 10};
        int[] newParts = new int[] {744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358};
        System.out.println(Arrays.toString(sumParts(parts)));
        System.out.println(Arrays.toString(sumParts(newParts)));


  }

    public static int[] removeElement(int[] ls, int indexToRemove){
        int[] arr_new = new int[ls.length - 1];
        int j = indexToRemove;
        for (int z = 0, k = 0; z < ls.length; z++) {
            if (z != j) {
                arr_new[k] = ls[z];
                k++;
            }
        }
        return arr_new;
    }

    public static int calculateSum(int[] ls, int arrLength){
        int total = 0;
        int[] newArr = new int[ls.length];
        System.arraycopy(ls, arrLength, newArr, 0, ls.length - arrLength);

        for (int n : newArr) {
            total += n;
        }
        return total;
    }


    public static int[] sumParts(int[] ls) {
        //https://www.codewars.com/kata/5ce399e0047a45001c853c2b/train/java
        int[] sums = new int[ls.length+1];

        int i = 0;
        for (int sum : sums) {
            int total = 0;
            if(i==0){
                for (int n : ls) {
                    total += n;
                }

            } else {
                total = calculateSum(ls,i);
            }
            System.out.println(total);

            sums[i++] = total;

        }
            return sums;
        }












}



