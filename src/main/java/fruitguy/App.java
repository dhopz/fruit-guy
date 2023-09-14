package fruitguy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static fruitguy.Katas.Doubles.Circle.area;

public class App {
    public static void main(String[] args) {
        System.out.println(shiftedDiff("coffee","eecoff"));
        System.out.println(shiftedDiff("eecoff","coffee"));

        System.out.println(shiftedDiff("hoop","pooh"));

  }

  //https://www.codewars.com/kata/5596f6e9529e9ab6fb000014/train/java
  static int shiftedDiff(String first, String second){
      List<String> myList = new ArrayList<>(Arrays.asList(first.split("")));
      boolean match = false;
      int i = 1;
      while (i < first.length()) {
          myList.add(0, myList.remove(myList.size() - 1));
          StringBuilder builder = new StringBuilder(myList.size());
          for(String ch: myList){
              builder.append(ch);
          }
          if(builder.toString().equals(second)){
              match = true;
              break;
          }
          i++;
      }

      return match ? i : -1;
    }








}



