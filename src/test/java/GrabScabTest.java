import fruitguy.Katas.Arrays.GrabScab;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GrabScabTest {
    GrabScab grab;
    List<String> words;
    List<String> correctWords;

    @BeforeEach
    public void createGrab(){
        grab = new GrabScab();
        words = new ArrayList<>();
        correctWords = new ArrayList<>();
    }

    @Test
    void givenAStringAndList_WhenThereIsAnArray_ThenReturnAList(){
        words.add("sport");
        correctWords.add("sport");
        assertEquals(correctWords,grab.convert("ortsp",words));
    }
    @Test
    void givenAStringAndList_WhenCheckingWordInArray_ThenReturnAListWithTheWord(){
        words.add("sport");
        words.add("matey");
        correctWords.add("sport");
        assertEquals(correctWords,grab.convert("ortsp",words));
    }
    @Test
    void givenAStringAndList_WhenCheckingWordInArrayMoreWords_ThenReturnAListWithTheWord(){
        words.add("sport");
        words.add("matey");
        words.add("ports");
        correctWords.add("sport");
        correctWords.add("ports");
        assertEquals(correctWords,grab.convert("ortsp",words));
    }
    @Test
    void givenAStringAndList_WhenCheckingWordInArrayMoreWordsT_ThenReturnAnEmpty(){
        words.add("bob");
        words.add("baobob");
        assertEquals(correctWords,grab.convert("oob",words));
    }
    @Test
    void givenAStringAndList_WhenCheckingWordInArrayMoreWordsTb_ThenReturnAnEmpty(){
        words.add("first");
        correctWords.add("first");
        assertEquals(correctWords,grab.convert("trisf",words));
    }
    @Test
    void givenAStringAndList_WhenCheckingWordInArrayMoreWordsTb3_ThenReturnAnEmpty(){
        words.add("pool");
        words.add("horse");
        words.add("loop");
        words.add("donkey");
        words.add("superspecial");
        correctWords.add("pool");
        correctWords.add("loop");
        assertEquals(correctWords,grab.convert("oolp",words));
    }
    @Test
    void givenAStringAndList_WhenCheckingWordInArrayMoreWordsTb4_ThenReturnAnEmpty(){
        words.add("mountains");
        words.add("hills");
        words.add("mesa");
        correctWords.add("mountains");
        assertEquals(correctWords,grab.convert("ainstuomn",words));
    }


}
