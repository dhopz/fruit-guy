package fruitguy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static fruitguy.Katas.Integers.DutyFree.dutyFree;

public class App {
    public static void main(String[] args) {
        String[] newWords = new String[]{"kevin", "has", "no", "space"};
        System.out.println(Arrays.toString(spacey(newWords)));

    }

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








}



