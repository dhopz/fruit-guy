package fruitguy;


import java.util.*;

import static fruitguy.Katas.HashMapExamples.CardSorter.sortCards;

public class App {
    public static void main(String[] args) {
        String[] cards = new String []{"3", "9", "A", "5", "T", "8", "2", "4", "Q", "7", "J", "6", "K"};
        System.out.println(Arrays.toString(sortCards(cards)));

        String[] newCards = new String []{"Q", "2", "8", "6", "J", "K", "3", "9", "5", "A", "4", "7", "T"};
        System.out.println(Arrays.toString(sortCards(newCards)));

  }











}



