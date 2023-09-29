package fruitguy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {
        int[] parts = new int[] {0, 1, 3, 6, 10};
        System.out.println(Arrays.toString(sumParts(parts)));
//        System.out.println(Arrays.toString(removeElement(parts, 3)));


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

    public static int[] sumParts(int[] ls) {
        //https://www.codewars.com/kata/5ce399e0047a45001c853c2b/train/java
        int[] sums = new int[ls.length];

        int i = 0;
        int total = 0;
        for (int sum : sums) {

            for (int n : ls) {
                total += n;
            }
            System.out.println(i);
            System.out.println(Arrays.toString(removeElement(ls, i)));


            sums[i++] = total;
        }
            return sums;
        }












}



