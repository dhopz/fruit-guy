import fruitguy.Deadfish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DeadfishTest {
    Deadfish fish;

    @BeforeEach
    public void createFish(){
        fish = new Deadfish();
    }

    @Test
    void parse_GivenAStringOfI_ThenReturnAnArray(){
        int[] result = new int[]{1};
        assertArrayEquals(result, fish.parse("io"));
    }
    @Test
    void parse_GivenAStringOfII_ThenReturnAnArrayThatSquares(){
        int[] result = new int[]{9};
        assertArrayEquals(result, fish.parse("iiiso"));
    }
}
