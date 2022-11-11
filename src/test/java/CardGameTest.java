import fruitguy.Katas.CardGame;
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
    @Test
    void winner_Given2CardsEachWithJoshAce_ThenReturnStringWithWinnerHaving2Points(){
        String[] deckSteve = new String[]{"K","K"};
        String[] deckJosh = new String[]{"A","A"};
        assertEquals("Josh wins 2 to 0", game.winner(deckSteve,deckJosh));
    }
    @Test
    void winner_Given2CardsEachTheSame_ThenReturnStringWithTie(){
        String[] deckSteve = new String[]{"K","K"};
        String[] deckJosh = new String[]{"K","K"};
        assertEquals("Tie!", game.winner(deckSteve,deckJosh));
    }

    @Test
    void winner_Given2CardsEachTheSameButDifferentOrder_ThenReturnStringWithTie() {
        String[] deckSteve = new String[]{"A", "K"};
        String[] deckJosh = new String[]{"K", "A"};
        assertEquals("Tie!", game.winner(deckSteve, deckJosh));
    }

    @Test
    void winner_Given3CardsEach_ThenReturnStringWithTie(){
        String[] deckSteve = new String[]{"A", "K", "K"};
        String[] deckJosh = new String[]{"K", "A", "K"};
        assertEquals("Tie!", game.winner(deckSteve, deckJosh));
    }

    @Test
    void winner_GivenCardsThatAreNotKingOrAce_ThenReturnStringWithWinner(){
        String[] deckSteve = new String[]{"Q"};
        String[] deckJosh = new String[]{"J"};
        assertEquals("Steve wins 1 to 0", game.winner(deckSteve,deckJosh));
    }
    @Test
    void winner_GivenCardsThatAreNumerical_ThenReturnStringWithWinner(){
        String[] deckSteve = new String[]{"3","4","5"};
        String[] deckJosh = new String[]{"6","7","8"};
        assertEquals("Josh wins 3 to 0", game.winner(deckSteve,deckJosh));
    }
    @Test
    void winner_GivenCardsThatAreNumericalInDifferentOrder_ThenReturnStringWithWinner(){
        String[] deckSteve = new String[]{"3","7","5"};
        String[] deckJosh = new String[]{"6","4","8"};
        assertEquals("Josh wins 2 to 1", game.winner(deckSteve,deckJosh));
    }
    @Test
    void winner_GivenCardsThatAreSmallDeck_ThenReturnTie(){
        String[] deckSteve = new String[]{"T"};
        String[] deckJosh = new String[]{"T"};
        assertEquals("Tie!", game.winner(deckSteve,deckJosh));
    }
    @Test
    void winner_GivenCardsThatAreNumericalInDifferentOrderWithExample_ThenReturnStringWithWinner(){
        String[] deckSteve = new String[]{"A","7","8"};
        String[] deckJosh = new String[]{"K","5","9"};
        assertEquals("Steve wins 2 to 1", game.winner(deckSteve,deckJosh));
    }
}
