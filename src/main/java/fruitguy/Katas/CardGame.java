package fruitguy.Katas;

import java.util.Arrays;
import java.util.List;

public class CardGame {
    private int stevePoints = 0;
    private int joshPoints = 0;
    private final List<String> cards = Arrays.asList("3","4","5","6","7","8","9","T","J","Q","K","A");
    public String winner(String[] deckSteve, String[] deckJosh){

        for(int i = 0; i < deckSteve.length; i++) {
            if (cards.indexOf(deckSteve[i]) > cards.indexOf(deckJosh[i])){
               stevePoints ++;
            } else if (cards.indexOf(deckSteve[i]) < cards.indexOf(deckJosh[i])) {
                joshPoints ++;
            }
        }
        return returnWinner();
    }
    public String returnWinner(){
        if(stevePoints>joshPoints){
            return "Steve wins " + stevePoints + " to " + joshPoints;
        } else if (joshPoints>stevePoints) {
            return "Josh wins " + joshPoints + " to " + stevePoints;
        } else {
            return "Tie!";
        }
    }
}
