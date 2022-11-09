package fruitguy;
import java.util.*;

import static fruitguy.NewIncrementer.incrementer;


public class App {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(incrementer(new int[]{4, 6, 7, 1, 3})));

    }

}



