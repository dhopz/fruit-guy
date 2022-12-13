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
        System.out.println(declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
        System.out.println(declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        System.out.println(declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
        System.out.println(declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));

    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = fighter1.name;

        if (Objects.equals(firstAttacker, fighter1.name)){
            while (fighter1.health >= 0 || fighter2.health >= 0){
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health >=0){
                    winner = fighter1.name;
                }
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health >=0){
                    winner = fighter2.name;
                }
            }
        } else {
            while (fighter1.health >= 0 || fighter2.health >= 0){
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health >=0){
                    winner = fighter2.name;
                }
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health >=0){
                    winner = fighter1.name;
                }
            }
        }
        System.out.println("Fighter2 health " + fighter2.health);
        System.out.println("Fighter1 health " + fighter1.health);

        return winner;
    }

}



