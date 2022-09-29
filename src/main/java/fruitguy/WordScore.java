package fruitguy;

import java.util.Arrays;
import java.util.List;

public class WordScore {
    public String returnScore(String word) {
        String[] arr = word.split(" ");
        String letters = "abcdefghijklmnopqrstuvwxyz";

        String positionOfHighest = null;
        int highestScore = 0;

        for (String s : arr) {
            int wordScore = 0;
            for(String y:s.split("")){
                wordScore += letters.indexOf(y)+1;
            }
            if (wordScore > highestScore){
                highestScore = wordScore;
                positionOfHighest = s;
            }
        }

        return positionOfHighest;
    }
}
