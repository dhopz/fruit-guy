import fruitguy.CardGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardGameTest {
    CardGame game;

    @BeforeEach
    public void createGame(){
        game = new CardGame();
    }
    @Test
    void winner_AceBeatsKing_returnStringForWinner(){
        String[] deckSteve = new String[]{"A"};
        String[] deckJosh = new String[]{"K"};
        assertEquals("Steve wins 1 to 0",game.winner(deckSteve,deckJosh));
    }
    @Test
    void winner_AceBeatsKing_returnDifferentStringForWinner(){
        String[] deckSteve = new String[]{"K"};
        String[] deckJosh = new String[]{"A"};
        assertEquals("Josh wins 1 to 0",game.winner(deckSteve,deckJosh));
    }
    @Test
    void winner_Given2CardsEach_ThenReturnStringWithWinnerHaving2Points(){
        String[] deckSteve = new String[]{"A","A"};
        String[] deckJosh = new String[]{"K","K"};
        assertEquals("Steve wins 2 to 0", game.winner(deckSteve,deckJosh));
    }
}
