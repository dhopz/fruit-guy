package fruitguy;

import fruitguy.Katas.DecWinner.Fighter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static fruitguy.Katas.DecWinner.declareWinner;
import static fruitguy.Katas.DescendingOrderDigit.sortDesc;
import static fruitguy.Katas.DriversLicence.driver;


public class App {
    public static void main(String[] args) {
//        Fighter fighter1 = new Fighter("Lew",10,2);
//        Fighter fighter2 = new Fighter("Harry",5,4);
//        System.out.println(declareWinner(fighter1,fighter2,"Lew"));
//        System.out.println(declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
        System.out.println(declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
//        System.out.println(declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
//        System.out.println(declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));

    }
}



