package fruitguy.Katas.Games;

import java.util.ArrayList;
import java.util.List;

public class Fizz {
    public static void returnBuzz() {
        for (int i = 1; i <= 100; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0){
                System.out.println("Fizz");
            } else if (i%5==0){
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
    }
    public static Object[] createFizz() {
        List<Object> fizzList = new ArrayList<>();
        for(int i=1;i<=100; i++){
            if(i%3==0 && i%5==0){
                fizzList.add("FizzBuzz");
            } else if(i%3==0){
                fizzList.add("Fizz");
            } else if(i%5==0){
                fizzList.add("Buzz");
            } else {
                fizzList.add(i);
            }
        }
        Object[] newFizzList = new Object[fizzList.size()];
        return fizzList.toArray(newFizzList);
    }
}
