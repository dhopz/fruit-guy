package fruitguy.Katas.Maps;

import java.util.HashMap;

public class NonRepeat {
    public static Character firstNonRepeated(String source) {
        //https://www.codewars.com/kata/570f6436b29c708a32000826/train/java
        HashMap<Character,Integer> charFreq = new HashMap<>();

        for(int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            if (charFreq.containsKey(c)) {
                charFreq.put(c, charFreq.get(c) + 1);
            } else {
                charFreq.put(c, 1);
            }
        }
        for (int i = 0; i<source.length(); i++){
            char c = source.charAt(i);
            if(charFreq.get(c)==1){
                return c;
            }
        }

        return '\0';
    }
}
