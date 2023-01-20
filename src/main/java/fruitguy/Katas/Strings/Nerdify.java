package fruitguy.Katas.Strings;

import java.util.ArrayList;

public class Nerdify {
    //https://www.codewars.com/kata/59e9f404fc3c49ab24000112/java
    public static String bestNerdify(String txt){
        return txt.replaceAll("[aA]", "4").replaceAll("[eE]", "3").replace("l", "1");
    }
    public static String nerdify(String txt){
        char[] ch = txt.toCharArray();
        ArrayList<Character> newTxt = new ArrayList();
        StringBuilder builder = new StringBuilder(newTxt.size());

        for (char c : ch) {
            if (c == 'e' || c == 'E') {
                newTxt.add('3');
            } else if (c == 'a' || c == 'A'){
                newTxt.add('4');
            } else if (c == 'l') {
                newTxt.add('1');
            } else {
                newTxt.add(c);
            }
        }

        for(Character x: newTxt)
        {
            builder.append(x);
        }

        return builder.toString();
    }
}
