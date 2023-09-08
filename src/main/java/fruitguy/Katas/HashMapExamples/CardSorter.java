package fruitguy.Katas.HashMapExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CardSorter {
    //https://www.codewars.com/kata/56f399b59821793533000683/java
    public static String[] sortCards (String[] cards) {
        String[] ranked = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
        Map<String, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < ranked.length; i++) {
            orderMap.put(ranked[i], i);
        }

        Comparator<String> customComparator = (a, b) -> {
            int orderA = orderMap.getOrDefault(a, Integer.MAX_VALUE);
            int orderB = orderMap.getOrDefault(b, Integer.MAX_VALUE);
            return Integer.compare(orderA, orderB);
        };

        Arrays.sort(cards, customComparator);
        return cards;
    }
}
