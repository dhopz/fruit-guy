package fruitguy.Katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class GrabScab {
    public List<String> convert(String s, List<String> words) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        List<String> checkedWords = new ArrayList<>();
        String[] result = s.split("");

        int wordScore = 0;
        for(String y:result){
            wordScore += letters.indexOf(y);
        }

        for(String singleWord:words){
            int counter = 0;
            String[] singleWordSplit = singleWord.split("");
            for(int i = 0; i < singleWord.length(); i++){
                counter += letters.indexOf(singleWordSplit[i]);
            }
            if (counter == wordScore && s.length() == singleWord.length()){
                checkedWords.add(singleWord);
            }
        }
        return checkedWords;
    }

}
