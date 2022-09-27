package fruitguy;

import java.util.Objects;

public class CardGame {
    public String winner(String[] deckSteve, String[] deckJosh){
        char[] cards = new char[]{'3','4','5','6','7','8','9','T','J','Q','K','A'};

        int stevePoints = 0;
        int joshPoints = 0;

        for(int i = 0; i < deckSteve.length; i++) {
            if (Objects.equals(deckSteve[i], "A") && Objects.equals(deckJosh[i], "K")) {
                stevePoints += 1;
            } else {
                joshPoints += 1;
            }
        }

        if(stevePoints>joshPoints){
            return "Steve wins " + stevePoints + " to " + joshPoints;
        } else {
            return "Josh wins 1 to 0";
        }

    }
}
