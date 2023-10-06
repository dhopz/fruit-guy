package fruitguy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static fruitguy.Katas.Algorithms.TicTacToeChecker.isSolved;

public class App {
    public static void main(String[] args) {
        List<String> children = new ArrayList<>();
        Collections.addAll(children, "Jason", "Jackson", "Jordan", "Johnny");
        List<String> goodChildren = new ArrayList<>();
        Collections.addAll(goodChildren,"Jason","Jordan","Jennifer");
        System.out.println(findChildren(children,goodChildren));



    }

    public static List<String> findChildren(List<String> santasList, List<String> children) {
        List<String> childrenList = new ArrayList<>();

        for (String kid : santasList) {
            if (!childrenList.contains(kid)) {
                childrenList.add(kid);
            }
        }
        System.out.println(childrenList);
        return childrenList;
    }





    }























