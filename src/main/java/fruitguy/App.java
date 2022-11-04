package fruitguy;

import java.util.*;

public class App {
    public static void main(String[] args) {
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        if (employed && vacation) {
            return false;
        }
        return employed;
    }

    public static List<Integer> randomNumberGeneratorList(){
        List<Integer> pickedNumbers = new ArrayList<>();
        Random rand = new Random();
        for(int i = 1; i <= 5; i++){
            pickedNumbers.add(rand.nextInt(50));
        }
        pickedNumbers.add(rand.nextInt(12));
        pickedNumbers.add(rand.nextInt(12));
        return pickedNumbers;
    }
    public static String countingSheep(int num){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i<=num; i++){
            sb.append(i).append(" sheep...");
        }
        return sb.toString();
    }
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



