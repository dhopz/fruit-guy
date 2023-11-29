package fruitguy.Katas.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class SantaList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
        //https://www.codewars.com/kata/5a0b4dc2ffe75f72f70000ef/train/java
        return children.stream()
                .filter(child -> santasList.contains(child))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
