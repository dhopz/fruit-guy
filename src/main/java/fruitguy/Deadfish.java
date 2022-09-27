package fruitguy;

public class Deadfish {
    public static int[] parse(String data){
        char[] fishes = data.toCharArray();

        for(char fish:fishes){
            System.out.println(fish);
        }

        int[] newArr = new int[]{1};
        return newArr;
    }

}
