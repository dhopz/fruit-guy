package fruitguy;
import java.util.*;

import static fruitguy.Katas.CountPassengers.countPassengers;

public class App {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});

        System.out.println(countPassengers(list));


    }







}



