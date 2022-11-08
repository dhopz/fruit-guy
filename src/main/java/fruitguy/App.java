package fruitguy;

import java.util.*;

public class App {
    public static void main(String[] args) {
//        int[] array = new int[] {1, 2, 6, 9, 11};
        int[] array2 = new int[] {104, 103, 91, 86, 86, 64, 62,};
//        int[] array3 = new int[] {4, 2, 30};

//        System.out.println(isSortedAndHow(array));
        System.out.println(isSortedAndHow(array2));
//        System.out.println(isSortedAndHow(array3));

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

    public static String isSortedAndHow(int[] array) {
//        System.out.println(Arrays.toString(array));
        ArrayList<String> indicators = new ArrayList<>();

        for (int i = 1; i < array.length; i++){
            if (array[i] >= array[i-1]){
                indicators.add("ascending");
            }  else if (array[i] <= array[i-1]) {
                indicators.add("descending");
            } else {
                indicators.add("no");
            }
        }
        boolean allEqual = indicators.stream().distinct().limit(2).count() <= 1;
        System.out.println(indicators);

        return allEqual? "yes, " + indicators.get(0):"no";
    }


}



