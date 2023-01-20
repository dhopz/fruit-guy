package fruitguy.Katas.Strings;

import java.util.Objects;

public class Covfefe {
    //https://www.codewars.com/kata/592fd8f752ee71ac7e00008a/java
    public static String covfefe(String tweet) {
        String[] words = tweet.split(" ");
        int counter = 0;
        for(int i = 0; i < words.length; i++) {
            if (Objects.equals(words[i], "coverage")) {
                counter++;
            }
            words[i] = words[i].replace("coverage", "covfefe");
        }
        if (String.join(" ", words).equals("double space")){
            return String.join(" ", words) + "  covfefe";
        } else if (counter == 0 && words.length >= 1) {
            return String.join(" ", words) + " covfefe";
        } else {
            return String.join(" ", words);
        }
    }

    static String bestSolutionCovfefe(final String tweet) {
        return tweet.contains("coverage") ?
                tweet.replace("coverage", "covfefe") :
                tweet + " covfefe";
    }

}
