package fruitguy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static fruitguy.Katas.WhileLoop.Atm.solution;

public class App {
    public static void main(String[] args) {
        String[] cards = new String []{"3", "9", "A", "5", "T", "8", "2", "4", "Q", "7", "J", "6", "K"};
        System.out.println(Arrays.toString(sortCards(cards)));

  }

    public static String[] sortCards (String[] cards) {
        List<String> sortedList = new ArrayList<>();
        String[] ranked = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
        for (String card : cards) {
            System.out.println(card);
        }

        for (int i = 0; i < cards.length; i++) {
            if (Objects.equals(cards[i], ranked[i])) {
                System.out.println("here");
            }
        }
        return new String[]{"a","b","c"};
    }









}



