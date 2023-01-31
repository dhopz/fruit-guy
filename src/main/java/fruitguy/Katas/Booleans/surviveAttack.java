package fruitguy.Katas.Booleans;

import java.util.Arrays;

public class surviveAttack {
    // https://www.codewars.com/kata/634d0f7c562caa0016debac5/java
    public static boolean block(int[] attackers, int[] defenders){
        int attackSurvivors = 0;
        int defenderSurvivors = 0;
        int attackPower = 0;
        int defenderPower = 0;

        System.out.println(Arrays.toString(attackers));
        System.out.println(Arrays.toString(defenders));

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

        for (int z = 0; z < allAttackers.length; z++) {
            attackPower += allAttackers[z];
            defenderPower += allDefenders[z];
            if (allAttackers[z] == allDefenders[z]) {
                attackSurvivors++;
                defenderSurvivors++;
            } else if(allAttackers[z] > allDefenders[z]) {
                attackSurvivors++;
            } else {
                defenderSurvivors++;
            }
        }

        if(defenders.length == attackers.length) {
            if (defenderSurvivors == attackSurvivors) {
                return attackPower <= defenderPower;
            } else {
                return defenderSurvivors >= attackSurvivors;
            }
        } else return defenders.length > attackers.length;
    }

    public static boolean solutionBlock(int[] attackers, int[] defenders){

        int poderAtaque = Arrays.stream(attackers).sum();
        int poderDefensa = Arrays.stream(defenders).sum();

        int supervivientes = 0;
        supervivientes = supervivientes + defenders.length - attackers.length;

        for (int i = 0; i < defenders.length && i < attackers.length; i++) {

            if(attackers[i] < defenders[i]) {
                supervivientes++;
            }
            else if(attackers[i] != defenders[i]) {
                supervivientes--;
            }
        }
        return supervivientes > 0 || supervivientes == 0 && poderDefensa >= poderAtaque;
    }
}
