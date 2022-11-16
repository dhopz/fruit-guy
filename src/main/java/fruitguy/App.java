package fruitguy;

//import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static fruitguy.Katas.FluchChecker.checkIfFlush;
import static fruitguy.Katas.ReverseString.reverseWords;
import static fruitguy.Katas.Stratholme.purify;

public class App {
    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(4,17));

    }

    public static int dontGiveMeFive(int start, int end){
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = start; i <= end; i++){
            if (!String.valueOf(i).contains("5")){
                numbers.add(i);
            }
        }

        return numbers.size();
    }
}


