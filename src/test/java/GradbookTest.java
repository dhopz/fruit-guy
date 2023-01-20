import fruitguy.Katas.Characters.Gradbook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GradbookTest {
    @Test
    void GivenThreeScores_WhenCalculatedToGivenAnAverage_ThenReturnAnA(){
        Gradbook grades = new Gradbook();
        assertEquals('A',grades.calculate(95,90,93));
    }
    @Test
    void GivenThreeScores_WhenCalculatedToGivenAnAverageForB_ThenReturnAnB(){
        Gradbook grades = new Gradbook();
        assertEquals('B',grades.calculate(70,70,100));
    }
}
