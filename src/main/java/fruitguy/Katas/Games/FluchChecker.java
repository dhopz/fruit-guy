package fruitguy.Katas.Games;

import java.util.Objects;

public class FluchChecker {
    public static boolean checkIfFlush(String[] cards){
        //Write some code here
        String suit = cards[0].substring(cards[0].length()-1);
        for (String x: cards) {
            if (!Objects.equals(suit, x.substring(x.length() - 1))) {
                return false;
            }
        }
        return true;

    }
}
