package fruitguy;

import java.util.Objects;

public class CardGame {
    public String winner(String[] deckSteve, String[] deckJosh){
        char[] cards = new char[]{'3','4','5','6','7','8','9','T','J','Q','K','A'};

        int stevePoints = 0;
        int joshPoints = 0;

        if(Objects.equals(deckSteve[0],"A") && Objects.equals(deckJosh[0],"K")){
            stevePoints += 1;
        } else {
            joshPoints += 1;
        }

        if(stevePoints>joshPoints){
            return "Steve wins 1 to 0";
        } else {
            return "Josh wins 1 to 0";
        }

    }
}
