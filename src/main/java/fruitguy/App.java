package fruitguy;

import java.util.*;

import static fruitguy.Katas.Strings.FilterString.filterString;


public class App {
    public static void main(String[] args) {
        System.out.println(insertDash(454793));

    }
    //https://www.codewars.com/kata/55960bbb182094bc4800007b/train/java

    public static String insertDash(int i) {;
        List<Integer> digits = new ArrayList<>();
        List<Integer> newDigits = new ArrayList<>();


        while(i > 0) {
            digits.add(i % 10);
            i /= 10;
        }
        System.out.println(digits);

        newDigits.add(digits.get(0));

        for(int x = 1; i<digits.size(); i++){
            if(newDigits.get(0) % 2 == 0){
                newDigits.add(digits.get(x));
            }
            System.out.println(newDigits);
        }

        return "";
    }



}



