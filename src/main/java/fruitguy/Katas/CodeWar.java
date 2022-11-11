package fruitguy.Katas;

import java.util.Arrays;
import java.util.Collections;

public class CodeWar {


    public static String codeWarResult(int[] codewarrior, int[] opponent) {
        Arrays.sort(codewarrior);
        Arrays.sort(opponent);
        int c1=0;
        int c2=codewarrior.length-1;
        int o1=0;
        int o2=opponent.length-1;
        int win = 0;
        int lose = 0;

        for (int i = 0; i < codewarrior.length; i++) {
            if (codewarrior[c2] > opponent[o2]) {
                win++;
                c2--;
                o2--;
            } else {
                if (codewarrior[c1] > opponent[o1]) {
                    win++;
                    c1++;
                    o1++;
                } else {
                    if (codewarrior[c1] > opponent[o2]) {
                        win++;
                    } else if (codewarrior[c1] < opponent[o2]){
                        lose++;
                    }
                    c1++;
                    o2--;
                }
            }
        }
        return win > lose ? "Victory" : win < lose ? "Defeat" : "Stalemate";
    }

}
