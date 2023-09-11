package fruitguy.Katas.Arrays;

import java.util.Objects;

public class RobotTattooRemoval {
    public static String[][] robot(String[][] skinScan) {
        for(String[] skin:skinScan){
            for(int i = 0; i < skin.length; i++){
                if(Objects.equals(skin[i], "*")){
                    skin[i] = "X";
                }
            }
        }
        return skinScan; //code code code
    }
}
