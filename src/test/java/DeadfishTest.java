import fruitguy.Deadfish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void parse_GivenAStringOfI_ThenReturnAnIncrementOf1(){
        fish.parse("i");
        assertEquals(Integer.valueOf(1), fish.getFishyNum());
    }
    @Test
    void parse_GivenAStringOfIIS_ThenNumberThatSquares(){
        fish.parse("iiis");
        assertEquals(Integer.valueOf(9), fish.getFishyNum());
    }

    @Test
    void parse_GivenAStringOfIIIS_ThenReturnAnArrayWithASquaredNum(){
        int[] result = new int[]{9};
        assertArrayEquals(result, fish.parse("iiiso"));
    }
    @Test
    void parse_GivenAStringOfIIISD_ThenNumberThatSquaresIsDecremented(){
        fish.parse("iiisd");
        assertEquals(Integer.valueOf(8), fish.getFishyNum());
    }
    @Test
    void parse_GivenAStringOfIIISDO_ThenNumberThatSquaresIsDecremented(){
        int[] result = new int[]{8};
        assertArrayEquals(result, fish.parse("iiisdo"));
    }
    @Test
    void parse_GivenAStringOfIOIO_ThenArrayHasASizeOf2(){
        int[] result = new int[]{1,2};
        assertArrayEquals(result, fish.parse("ioio"));
    }
    @Test
    void parse_GivenAStringThatSquaresOfIO_ThenArrayHasASizeOf2AndIsSquared(){
        int[] result = new int[]{2,4};
        assertArrayEquals(result, fish.parse("iioso"));
    }

    @Test
    void parse_GivenARangeOfStringItems_ThenArrayHasASizeOf2AndIsSquared(){
        int[] result = new int[]{8,64};
        assertArrayEquals(result, fish.parse("iiisdoso"));
    }
    @Test
    void parse_GivenARangeOfStringItems_ThenArrayHasASizeOf3AndIsSquared(){
        int[] result = new int[]{8,64,3600};
        assertArrayEquals(result, fish.parse("iiisdosodddddiso"));
    }
}
