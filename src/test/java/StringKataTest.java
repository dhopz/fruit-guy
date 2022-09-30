import fruitguy.StringKata;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringKataTest {
    StringKata kata;
    Map<String,Integer> score;

    @BeforeEach
    public void createKata(){
        kata = new StringKata();
        score = new HashMap<>();
    }

    @Test
    void givenWeReceiveAnArray_WhenThereIsASingleString_ThenReturnsASingleAppearance(){
        score.put("a",1);
        assertEquals(score,kata.calculateScore(new String[]{"a"}));
    }
    @Test
    void givenAnArray_WhenThereIs2StringsInArray_ThenReturnSingleAppearanceForBothStrings(){
        score.put("a",1);
        score.put("b",1);
        assertEquals(score,kata.calculateScore(new String[]{"a","b"}));
    }
    @Test
    void givenAnArray_WhenThereAreManyDifferentStrings_ThenReturnCountForStringAppearance(){
        score.put("a",1);
        score.put("b",1);
        score.put("c",1);
        assertEquals(score,kata.calculateScore(new String[]{"a","b","c"}));
    }
    @Test
    void givenAnArray_WhenThereIsMultipleStringsOfTheSame_ThenReturnCountOfTheAppearance(){
        score.put("a",2);
        score.put("b",1);
        assertEquals(score,kata.calculateScore(new String[]{"a","a","b"}));
    }
    @Test
    void givenAnArray_WhenThereIsAnArrayWithUpperCaseAnLowerCase_ThenReturnCountOfAppearance(){
        score.put("A",1);
        score.put("a",1);
        assertEquals(score,kata.calculateScore(new String[]{"A","a"}));
    }
    @Test
    void givenAnArray_WhereThereIsAnEmptyArray_ThenReturnAnEmptyMap(){
        assertEquals(score,kata.calculateScore(new String[]{}));
    }
    @Test
    void givenAnArray_WhenThereIsAnArrayWithMultipleInstancesOfMultipleStrings_ThenReturnCountOfAppearances(){
        score.put("a",1);
        score.put("b",2);
        score.put("c",3);
        assertEquals(score,kata.calculateScore(new String[]{"a","b","b","c","c","c"}));
    }
    @Test
    void givenAnArray_WhenThereIsAnArrayWithNumbers_ThenReturnCountOfAppearance(){
        score.put("1",2);
        score.put("2",2);
        assertEquals(score,kata.calculateScore(new String[]{"1","1","2","2"}));
    }

    @Test
    void givenAnArray_WhenThereIsAnArrayWithPunctuatedWords_ThenReturnCountOfAppearance(){
        score.put("can't",2);
        assertEquals(score,kata.calculateScore(new String[]{"can't","can't"}));
    }
    @Test
    void givenAnArray_WhenThereIsAnArrayWithNull_ThenReturnCountOfNulls(){
        score.put(null,3);
        assertEquals(score,kata.calculateScore(new String[]{null,null,null}));
    }
    @Test
    void givenAnArray_WhenThereIsAnArrayWithWords_ThenReturnCountOfAppearance(){
        score.put("words",2);
        score.put("string",1);
        score.put("STRING",1);
        assertEquals(score,kata.calculateScore(new String[]{"words","words","string","STRING"}));
    }
    @Test
    void givenAnArray_WhenThereIsAnArrayWithMultipleInstancesOfMultipleStringsInShuffledArray_ThenReturnCountOfAppearances(){
        score.put("a",1);
        score.put("c",3);
        score.put("b",3);
        assertEquals(score,kata.calculateScore(new String[]{"b","b","c","c","b","c","a"}));
    }
    @Test
    void givenAnArray_WhenThereIsACombinationOfLettersAnStringsAndNumbers_ThenReturnCountOfAppearance() {
        score.put("words", 2);
        score.put("a", 2);
        score.put("1", 1);
        assertEquals(score, kata.calculateScore(new String[]{"words", "a", "1", "a", "words"}));
    }

}
