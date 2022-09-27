package fruitguy;

import java.util.ArrayList;
import java.util.List;

public class Deadfish {

    private int fishyNum = 0;
    public int[] parse(String data){
        List<Integer> newArr = new ArrayList<>();
        char[] fishes = data.toCharArray();

        for(char fish:fishes){
            if(fish == 'i'){
                fishyNum++;
            }
            if(fish == 's'){
                fishyNum = fishyNum * fishyNum;
            }
            if(fish == 'o'){
                newArr.add(fishyNum);
            }
            if(fish== 'd'){
                fishyNum--;
            }
       }
        return buildIntArray(newArr);
    }
    public int getFishyNum() {
        return fishyNum;
    }

    public int[] buildIntArray(List<Integer> integers) {
        int[] ints = new int[integers.size()];
        int i = 0;
        for (Integer n : integers) {
            ints[i++] = n;
        }
        return ints;
    }

}
