package fruitguy.Katas;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrays {
    public static int[] mergeArr(int[] first, int[] second) {
        int[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        Arrays.sort(result);

        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer element : result) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList.stream().mapToInt(i->i).toArray();
    }
}
