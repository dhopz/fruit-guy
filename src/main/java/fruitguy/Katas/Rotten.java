package fruitguy.Katas;

import java.util.ArrayList;
import java.util.List;

class Rotten {
    public static String[] removeRotten(String[] fruitBasket){
        List<String> newFruit = new ArrayList<>();
        if (fruitBasket != null ) {
            for (String fruit : fruitBasket) {
                String fruit2 = fruit.replace("rotten", "");
                char[] c = fruit2.toCharArray();
                c[0] = Character.toLowerCase(c[0]);
                String lowerFruit = new String(c);
                newFruit.add(lowerFruit);
            }
            return newFruit.toArray(new String[0]);
        }
        return newFruit.toArray(new String[0]);
    }

    public static String[] bestSolution(String[] fruitBasket) {
        if(fruitBasket == null || fruitBasket.length == 0) return new String[0];

        for(int i = 0; i < fruitBasket.length; i++)
            fruitBasket[i] = fruitBasket[i].replace("rotten", "").toLowerCase();

        return fruitBasket;
    }
}
