package fruitguy;


import java.util.Arrays;

import static fruitguy.Katas.Arrays.SumParts.partsSums;


public class App {
    public static void main(String[] args) {
        int[] parts = new int[] {0, 1, 3, 6, 10};
        int[] newParts = new int[] {744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358};

        System.out.println(Arrays.toString(partsSums(parts)));
        System.out.println(Arrays.toString(partsSums(newParts)));


  }












}



