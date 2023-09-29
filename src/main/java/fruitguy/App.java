package fruitguy;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {
        int[] parts = new int[] {0, 1, 3, 6, 10};
        System.out.println(Arrays.toString(sumParts(parts)));
//        System.out.println(Arrays.toString(removeElement(parts, 3)));
        System.out.println(calculateSum(parts));


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

    public static int calculateSum(int[] ls){
        int total = 0;
        for (int n : ls) {
            total += n;
        }
        return total;
    }

    public static int[] sumParts(int[] ls) {
        //https://www.codewars.com/kata/5ce399e0047a45001c853c2b/train/java
        int[] sums = new int[ls.length];

        int i = 0;
//        int total = 0;
        for (int sum : sums) {
            int total = 0;
            if(i==0){
                System.out.println("this is i");
                for (int n : ls) {
                    total += n;
                }
//                sums[i++] = total;
                System.out.println(total);

            } else {
                System.out.println("not here");
                int[] newArr = new int[ls.length];
                System.arraycopy(ls, i, newArr, 0, ls.length - i);
                System.out.println(Arrays.toString(newArr));

                for (int n : newArr) {
                    total += n;
                }
                System.out.println(total);
            }



//            int[] newArr = new int[ls.length];
//            System.arraycopy(ls, i, newArr, 0, ls.length - i);
//            System.out.println(Arrays.toString(newArr));
//
//            for (int n : newArr) {
//                total += n;
//            }
//            System.out.println(total);
            sums[i++] = total;

        }
            return sums;
        }












}



