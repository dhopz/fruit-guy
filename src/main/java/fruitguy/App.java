package fruitguy;

import java.util.*;

import static fruitguy.Katas.Strings.FilterString.filterString;


public class App {
    public static void main(String[] args) {
        //https://www.codewars.com/kata/634d0f7c562caa0016debac5/train/java

//        System.out.println(block(new int[] { 1, 3, 5, 7 }, new int[] { 2, 4, 6, 8 }));
//        System.out.println(block(new int[] { 2, 9, 9, 7 }, new int[] { 1, 1, 3, 8 }));
//        System.out.println(block(new int[] { 10, 10, 1, 1 }, new int[] { 4, 4, 7, 7 }));
//        System.out.println(block(new int[] { }, new int[] { 1,2,3 }));
//        System.out.println(block(new int[] {1,2,3 }, new int[] { }));
        System.out.println(block(new int[] {1,3,5,7}, new int[] {2,4}));


    }

    public static boolean block(int[] attackers, int[] defenders){
        int attackSurvivors = 0;
        int defenderSurvivors = 0;
        int attackPower = 0;
        int defenderPower = 0;

        int[] allDefenders = new int[attackers.length];
        int[] allAttackers = new int[defenders.length];
        int i = 0;
        if (attackers.length > defenders.length) {
            for (int n : defenders) {
                allDefenders[i++] = n;
            }
            allAttackers = attackers;
        } else {
            for (int n : attackers) {
                allAttackers[i++] = n;
            }
            allDefenders = defenders;
        }

        System.out.println(Arrays.toString(allAttackers));
        System.out.println(Arrays.toString(allDefenders));

        for (int z = 0; z < allAttackers.length; z++) {
            attackPower += allAttackers[z];
            defenderPower += allDefenders[z];
            if (allAttackers[z] >= allDefenders[z]) {
                attackSurvivors++;
            } else {
                defenderSurvivors++;
            }
        }

        System.out.println(attackPower + "attack power vs" + defenderPower + "defender power");
        System.out.println(attackSurvivors + "attack survivors vs " + defenderSurvivors +" defender survivors");
//        return defenderSurvivors >= attackSurvivors;

        return defenderSurvivors != attackSurvivors || defenderPower < attackPower;

    }






}



