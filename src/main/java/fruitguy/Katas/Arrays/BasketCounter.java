package fruitguy.Katas.Arrays;

import java.util.HashMap;
import java.util.Map;

public class BasketCounter {
    public static char[] splitBasket(String basket){
        return basket.toCharArray();
    }

    public static Map<Character,Integer> itemsInBasket(String basket){
        Map<Character,Integer> countItems = new HashMap<>();
        for (char item: splitBasket(basket)){
            if(!countItems.containsKey(item)){
                countItems.put(item,1);
            } else {
                countItems.put(item,countItems.get(item)+1);
            }
        }
        return countItems;
    }
}
