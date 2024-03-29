package fruitguy.Katas.Games;

import java.util.Objects;

public class DecWinner {
    public static class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {


        if (Objects.equals(firstAttacker, fighter1.name)){
            while (fighter1.health >= 0 || fighter2.health >= 0){
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health <=0){
                    return fighter1.name;
                }
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health <=0){
                    return fighter2.name;
                }
            }
        } else {
            while (fighter1.health >= 0 || fighter2.health >= 0){
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health <=0){
                    return fighter2.name;
                }
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health <=0){
                    return fighter1.name;
                }
            }
        }
        System.out.println("Fighter2 health " + fighter2.health);
        System.out.println("Fighter1 health " + fighter1.health);

        return fighter1.name;
    }
}
