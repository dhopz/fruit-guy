package fruitguy.Katas.Arrays;

import java.util.ArrayList;
import java.util.List;
//https://www.codewars.com/kata/56576f82ab83ee8268000059/train/java

public class Spacey {
    public static String[] spacey(String[] array) {
        int counter = 0;
        List<String> combinedString = new ArrayList<>();
        combinedString.add(array[0]);
        for (String x: array){
            if (counter == 0){
                combinedString.add(array[0]);
            } else {
                combinedString.add(combinedString.get(counter) + x);
            }
            counter ++;
        }
        combinedString.remove(0);
        return combinedString.toArray(new String[0]);
    }

    public static String[] spaceyBestAnswer(String[] array) {
        for(int i=1; i < array.length; i++) {
            array[i] = array[i-1] + array[i];
        }
        return array;
    }
}
