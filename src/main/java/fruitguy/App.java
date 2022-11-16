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
        String[] cards = new String[]{"AS", "3D", "9S", "KS", "4S"};
        System.out.println(checkIfFlush(cards));

    }
}


