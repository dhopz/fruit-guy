package fruitguy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class High {
    public static String highandlow(String numbers) {
        String[] convertHighsLows = numbers.split(" ");
        int[] newNumbers = new int[convertHighsLows.length];
        for(int i = 0; i < convertHighsLows.length; i++){
            newNumbers[i] = Integer.parseInt(convertHighsLows[i]);
        }
        Arrays.sort(newNumbers);
        return String.valueOf(newNumbers[newNumbers.length - 1]) + " " + String.valueOf(newNumbers[0]);
    }

    public static String betterSolution(String numbers) {
        String[] num = numbers.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(String s : num){
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);

        return list.get(list.size() - 1) + " " + list.get(0);
    }

    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
    }

}
