import fruitguy.CardGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardGameTest {
    @Test
    void winner_AceBeatsKing_returnStringForWinner(){
        CardGame game = new CardGame();
        String[] deckSteve = new String[]{"A"};
        String[] deckJosh = new String[]{"K"};
        assertEquals("Steve wins 1 to 0",game.winner(deckSteve,deckJosh));
    }
    @Test
    void winner_AceBeatsKing_returnDifferentStringForWinner(){
        CardGame game = new CardGame();
        String[] deckSteve = new String[]{"K"};
        String[] deckJosh = new String[]{"A"};
        assertEquals("Josh wins 1 to 0",game.winner(deckSteve,deckJosh));
    }
}
