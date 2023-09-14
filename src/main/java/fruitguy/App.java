package fruitguy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static fruitguy.Katas.Doubles.Circle.area;

public class App {
    public static void main(String[] args) {
        System.out.println(shiftedDiff("coffee","eecoff"));
        System.out.println(shiftedDiff("hoop","pooh"));

  }

  //https://www.codewars.com/kata/5596f6e9529e9ab6fb000014/train/java
  static int shiftedDiff(String first, String second){
      List<String> myList = new ArrayList<>(Arrays.asList(first.split("")));
      System.out.println(myList);
      myList.add(0, myList.remove(myList.size() - 1));
      System.out.println(myList);


      List<Character> chars = new ArrayList<>();
        List<Character> secondChars = new ArrayList<>();

        for (char ch : first.toCharArray()) {
            chars.add(ch);
        }

        StringBuilder builder = new StringBuilder(chars.size());
        for(Character ch: chars)
        {
            builder.append(ch);
        }
        System.out.println(builder.toString());

      for (int i = 0; i < chars.size()-1; i++)
          chars.set(i, chars.get(i + 1));

      System.out.println(chars);

        for (char ch : second.toCharArray()) {
            secondChars.add(ch);
        }
        System.out.println(chars);

        return -1;
    }








}



