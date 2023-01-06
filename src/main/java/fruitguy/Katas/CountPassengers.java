package fruitguy.Katas;

import java.util.ArrayList;

public class CountPassengers {
    // https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/java
    public static int countPassengers(ArrayList<int[]> stops) {
        int peopleOn = 0;
        int peopleOff = 0;
        for(int[] x: stops){
            peopleOn = peopleOn + x[0];
            peopleOff = peopleOff + x[1];
        }
        return peopleOn - peopleOff;
    }
}
