package fruitguy;

import java.util.HashMap;
import java.util.Map;

public class StringKata {
    public Map<String,Integer> calculateScore(String[] strings) {
        Map<String,Integer> score = new HashMap<>();

        for(String word:strings){
            if(!score.containsKey(word)){
                score.put(word,1);
            } else {
                score.put(word,score.get(word)+1);
            }
        }
        return score;
    }
}
