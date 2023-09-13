package fruitguy;

import java.util.ArrayList;
import java.util.List;

import static fruitguy.Katas.Doubles.Circle.area;

public class App {
    public static void main(String[] args) {
        System.out.println(shiftedDiff("coffee","eecoff"));
        System.out.println(shiftedDiff("hoop","pooh"));

  }

    static int shiftedDiff(String first, String second){
        List<Character> chars = new ArrayList<>();
        for (char ch : first.toCharArray()) {
            chars.add(ch);
        }
        System.out.println(chars);
        return -1;
    }








}



