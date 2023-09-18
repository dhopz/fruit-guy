package fruitguy;


import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        int[] parts = new int[] {0, 1, 3, 6, 10};
        System.out.println(Arrays.toString(sumParts(parts)));


  }

    public static int[] sumParts(int[] ls) {
        int[] sums = new int[ls.length];

        int i = 0;
        for (int n:ls){
            sums[i++] = n;
        }

        return sums;
    }










}



