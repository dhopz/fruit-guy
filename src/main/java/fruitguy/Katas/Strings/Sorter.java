package fruitguy.Katas.Strings;

import java.util.ArrayList;

public class Sorter {
    public static String isSortedAndHow(int[] array) {
//        System.out.println(Arrays.toString(array));
        ArrayList<String> indicators = new ArrayList<>();

        for (int i = 1; i < array.length; i++){
            if (array[i] > array[i-1]){
                indicators.add("ascending");
            }  else if (array[i] <= array[i-1]) {
                indicators.add("descending");
            } else {
                indicators.add("no");
            }
        }
        boolean allEqual = indicators.stream().distinct().limit(2).count() <= 1;
        System.out.println(indicators);

        return allEqual? "yes, " + indicators.get(0):"no";
    }

    public static String isSortedAndHowBetterSolution(int[] array) {
        boolean desc = false;
        boolean asc = false;
        for(int i = 1; i < array.length; i++) {
            if(array[i] > array[i-1]) asc = true;
            if(array[i] < array[i-1]) desc = true;
        }
        if(asc && !desc) return "yes, ascending";
        if(desc && !asc) return "yes, descending";
        return "no";

    }
}
