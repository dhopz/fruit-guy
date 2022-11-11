import fruitguy.Katas.Deodorant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeodorantTest {
    @Test
    void givenContentEvaporationThreshold_whenEvaporatorIsUnknown_ThenReturnAnInteger(){
        Deodorant deodorant = new Deodorant();
        assertEquals(29,deodorant.calculateExpiry(10,10,5));
    }
    @Test
    void givenParameters_WhenEvaporatorIsUnknown_ThenReturnAnInteger(){
        Deodorant deodorant = new Deodorant();
        assertEquals(22,deodorant.calculateExpiry(10,10,10));
    }
}
