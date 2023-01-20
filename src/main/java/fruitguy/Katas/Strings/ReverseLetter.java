package fruitguy.Katas.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseLetter {
    // https://www.codewars.com/kata/58b8c94b7df3f116eb00005b/java
    public static String reverseLetter(final String str) {
        List<String> myList = new ArrayList<>(Arrays.asList(str.replaceAll("[^a-zA-Z]", "").split(" ")));
        myList.replaceAll(x -> String.valueOf(new StringBuffer(x).reverse()));
        return String.join(" ",myList);
    }

    public static String bestSolutionReverseLetter(String s){
        return new StringBuilder(s.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }

}
