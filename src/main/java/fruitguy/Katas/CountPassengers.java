package fruitguy.Katas;

import java.util.ArrayList;

public class CountPassengers {
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
