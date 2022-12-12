package fruitguy;

//import java.util.*;

import java.util.*;

import static fruitguy.Katas.DescendingOrderDigit.sortDesc;


public class App {
    public static void main(String[] args) {
//        System.out.println(sortDesc(42145));
        System.out.println(caffeineBuzz(1));

    }

    public static String caffeineBuzz(int n){
        System.out.println(n);
        if(n % 3 == 0 && n % 4 == 0){
            return "CoffeeSc";
        } else if (n % 3 == 0 && n % 2 == 0) {
            return "JavaScript";
        } else if (n % 3 == 0) {
            return "Java";
        } else {
            return "mocha_missing!";
        }

    }
}



