package fruitguy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CardGame {
    private int stevePoints = 0;
    private int joshPoints = 0;
    public String winner(String[] deckSteve, String[] deckJosh){
        List<String> cards = Arrays.asList("3","4","5","6","7","8","9","T","J","Q","K","A");

        for(int i = 0; i < deckSteve.length; i++) {
            if(cards.indexOf(deckSteve[i]) > cards.indexOf(deckJosh[i])){
               stevePoints += 1;
            } else if (cards.indexOf(deckSteve[i]) < cards.indexOf(deckJosh[i])) {
                joshPoints += 1;
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
