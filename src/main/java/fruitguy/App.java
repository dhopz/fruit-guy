package fruitguy;

import java.util.Arrays;

import static fruitguy.Katas.Arrays.OddsOrEvens.oddOrEven;
import static fruitguy.Katas.Arrays.SnailSorter.snail;
import static fruitguy.Katas.Arrays.SnailSorter.spiral;

public class App {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(snail(array)));
        System.out.println(Arrays.toString(spiral(array)));
    }




}



