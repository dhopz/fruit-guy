package fruitguy;

import fruitguy.Katas.DecWinner.Fighter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static fruitguy.Katas.DescendingOrderDigit.sortDesc;
import static fruitguy.Katas.DriversLicence.driver;


public class App {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Lew",10,2);
        Fighter fighter2 = new Fighter("Harry",5,4);
        System.out.println(declareWinner(fighter1,fighter2,"Lew"));

    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        if (Objects.equals(firstAttacker, fighter1.name)){
            fighter2.health = fighter2.health - fighter1.damagePerAttack;
        } else {
            fighter1.health = fighter1.health - fighter2.damagePerAttack;
        }
        System.out.println("Fighter2 health " + fighter2.health);
        System.out.println("Fighter1 health " + fighter1.health);

        return "name";
    }

}



