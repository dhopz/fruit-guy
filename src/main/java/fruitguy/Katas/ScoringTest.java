package fruitguy.Katas;

import java.util.HashMap;
import java.util.Map;

public class ScoringTest {
    public static int sol(int[] arr, int r, int o, int w){
        Map<Integer,Integer> score = new HashMap<>();
        for (int x: arr){
            if(!score.containsKey(x)){
                if (x == 0){
                    score.put(x,r);
                } else if (x == 1) {
                    score.put(x,o);
                } else {
                    score.put(x,w);
                }
            } else {
                if (x == 0){
                    score.put(x,score.get(x) + r);
                } else if (x == 1) {
                    score.put(x,score.get(x) + o);
                } else {
                    score.put(x,score.get(x) + w);
                }
            }
        }

        int points = 0;

        for (Map.Entry<Integer,Integer> entry : score.entrySet()) {
            if (entry.getKey() == 0){
                points = points + entry.getValue();
            } else if (entry.getKey() == 1) {
                points = points + entry.getValue();
            } else {
                points = points - entry.getValue();
            }
        }
        return points;
    }

    public static int betterSolutionSol(int[] arr, int r, int o, int w){

        int ergebnis = 0;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] == 0){
                ergebnis += r;
            }
            if (arr[i] == 1){
                ergebnis += o;
            }
            if (arr[i] == 2){
                ergebnis -= w;
            }
        }
        return ergebnis;
    }


}
