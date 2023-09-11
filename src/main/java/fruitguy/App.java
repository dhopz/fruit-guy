package fruitguy;


import java.util.*;

import static fruitguy.Katas.HashMapExamples.CardSorter.sortCards;

public class App {
    public static void main(String[] args) {
        String[][] skinScan = new String [][]{
                        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", "*", "*", " ", " ", " ", "*", "*", " ", " "},
                        {" ", "*", " ", " ", "*", " ", "*", " ", " ", "*", " "},
                        {" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "},
                        {" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "},
                        {" ", "*", " ", " ", " ", " ", " ", " ", " ", "*", " "},
                        {" ", "*", " ", " ", " ", " ", " ", " ", " ", "*", " "},
                        {" ", "*", " ", " ", " ", " ", " ", " ", " ", "*", " "},
                        {" ", " ", "*", " ", " ", " ", " ", " ", "*", " ", " "},
                        {" ", " ", " ", "*", " ", " ", " ", "*", " ", " ", " "},
                        {" ", " ", " ", " ", "*", " ", "*", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " ", " ", "P", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
        };
        System.out.println(Arrays.deepToString(robot(skinScan)));

  }

    public static String[][] robot(String[][] skinScan) {
        String newValue = "XXXXp";
        System.out.println(newValue.replace("X","*"));
        for(String[] skin:skinScan){
            System.out.println(Arrays.toString(skin));
            for(String scan: skin){
                scan.replace("*","l");
            }
        }
        System.out.println(Arrays.deepToString(skinScan));
        return null; //code code code
    };











}



