import fruitguy.Katas.WordScore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordScoreTest {
    WordScore score;

    @BeforeEach
    public void createWordScore(){
        score = new WordScore();
    }
    @Test
    void returnScore_InputString_ReturnString(){
        assertEquals("score",score.returnScore("score"));
    }

    @Test
    void returnScore_InputString_ReturnAWord(){
        assertEquals("score",score.returnScore("a score"));
    }

    @Test
    void returnScore_IntroduceScoringForWordInArray_ReturnAStringWord(){
        assertEquals("semynak",score.returnScore("take me to semynak"));
    }

    @Test
    void returnScore_ScorePoints_ReturnString(){
        assertEquals("cc",score.returnScore("cc aaa"));
    }

    @Test
    void returnScore_ScorePointsLongSentence_ReturnString(){
        assertEquals("volcano",score.returnScore("what time are we climbing up to the volcano"));
    }
}
