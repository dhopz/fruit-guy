package fruitguy;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import static fruitguy.Katas.Algorithms.TicTacToeChecker.isSolved;

public class App {
    public static void main(String[] args) {
        List<String> children = new ArrayList<>();
        Collections.addAll(children, "Jason", "Jackson", "Johnson", "JJ");
        List<String> goodChildren = new ArrayList<>();
        Collections.addAll(goodChildren,"JJ", "Jason");
        System.out.println(findChildren(children,goodChildren));

        String str1 = "Sam";
        String str2 = "sam";
        String str3 = "sAm";

        // Case-sensitive comparison
        boolean result1 = str1.equals(str2);
        boolean result2 = str1.equals(str3);

        System.out.println("str1 equals str2: " + result1); // false
        System.out.println("str1 equals str3: " + result2);



    }

    public static List<String> findChildren(List<String> santasList, List<String> children) {
        //https://www.codewars.com/kata/5a0b4dc2ffe75f72f70000ef/train/java
        return children.stream()
                .filter(child -> santasList.contains(child))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }





    }























