package fruitguy;

import java.util.ArrayList;
import java.util.Objects;

public class CountKookas {
    public static int Counter(final String laughing) {
        int interval = 2;
        if (laughing.length() <= 1) {
            return 0;
        }
        var subStrings = new ArrayList<String>();
        int pointer = 0;
        while (laughing.length() > pointer) {
            String substring = laughing.substring(pointer, pointer + interval);
            subStrings.add(substring);
            pointer += interval;
        }

        int counter = 1;
        String kookaType = subStrings.get(0);
        for (int i = 1; i <= subStrings.size()-1; i++){
            if (!Objects.equals(kookaType, subStrings.get(i))){
                counter ++;
            }
            kookaType = subStrings.get(i);
        }
        System.out.println(counter);
        return counter;
    }

    public static int counterSolution(final String laughing) {
        return laughing.isEmpty() ? 0 : laughing.split("haH|Hah").length;

    }
}
