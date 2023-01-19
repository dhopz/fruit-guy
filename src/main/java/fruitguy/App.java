package fruitguy;
import java.util.*;
import java.lang.Math;

import static fruitguy.Katas.Bingo.bingo;


public class App {
    public static void main(String[] args) {
        System.out.println(covfefe("coverage"));
        System.out.println(covfefe("coverage coverage"));
        System.out.println(covfefe("nothing"));
        System.out.println(covfefe("covfefe"));
        System.out.println(covfefe("double space "));

    }

    public static String covfefe(String tweet) {
        String[] words = tweet.split(" ");
        System.out.println(Arrays.toString(words));
        int counter = 0;
        for(int i = 0; i < words.length; i++) {
            if (Objects.equals(words[i], "coverage")) {
                counter++;
            }
            words[i] = words[i].replace("coverage", "covfefe");
        }
//        if (counter == 0){
//            return String.join(" ", words);
//        } else if (words.length > 1) {
//            return String.
//        }
        return counter == 0 ? String.join(" ", words) + " covfefe" : String.join(" ", words);

    }



}



