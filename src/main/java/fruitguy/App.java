package fruitguy;


import java.util.*;

import static fruitguy.Katas.HashMapExamples.CardSorter.sortCards;

public class App {
    public static void main(String[] args) {
        String[] practice = new String[]{" ", " ", "*", "*", " ", " ", " ", "*", "*", " ", " "};
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
        System.out.println(Arrays.toString(robotTwo(practice)));

  }
    public static String[] robotTwo(String[] newScan){
        for(int i = 0; i < newScan.length; i++){
            if(Objects.equals(newScan[i], "*")){
                newScan[i] = "p";
            }
        }
        System.out.println(Arrays.toString(newScan));
        return null;
    }

    public static String[][] robot(String[][] skinScan) {
        for(String[] skin:skinScan){
            for(int i = 0; i < skin.length; i++){
                if(Objects.equals(skin[i], "X")){
                    skin[i] = "*";
                }
            }
        }
        return skinScan; //code code code
    }











}



