package fruitguy.Katas.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {
    public static String reverseWords(String original){
        List<String> myList = new ArrayList<>(Arrays.asList(original.split(" ")));

        if(myList.isEmpty()){
            return original;
        } else {
            myList.replaceAll(str -> String.valueOf(new StringBuffer(str).reverse()));
            return String.join(" ",myList);
        }
    }
}
