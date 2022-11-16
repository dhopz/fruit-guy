package fruitguy.Katas;

import java.util.ArrayList;

public class RemovingFives {
    public static int dontGiveMeFive(int start, int end){
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = start; i <= end; i++){
            if (!String.valueOf(i).contains("5")){
                numbers.add(i);
            }
        }

        return numbers.size();
    }

    public static int bestSolution(int start, int end){
        int ans = 0;
        for (int i = start; i <= end; i++) {
            if (!("" + i).contains("5")) ans++;
        }
        return ans;
    }


}
