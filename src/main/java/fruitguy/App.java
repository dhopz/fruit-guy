package fruitguy;


import java.util.Arrays;

import static fruitguy.Katas.Arrays.SumParts.partsSums;


public class App {
    public static void main(String[] args) {
        System.out.println(longestWord("one two three"));
  }

    public static String longestWord(String wordString) {
        int wordLength = 0;
        String longestWord = null;
        for(String word: wordString.split(" ")){
            if(word.length() >= wordLength){
                wordLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }












}



