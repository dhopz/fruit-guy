package fruitguy.Katas.Integers;

public class PredictAge {
    //https://www.codewars.com/kata/5aff237c578a14752d0035ae/java
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int[] ages = new int[]{age1,age2,age3,age4,age5,age6,age7,age8};
        double sumOfAges = 0;
        for (int x: ages){
            sumOfAges += (x*x);
        }

        int i = (int) Math.sqrt(sumOfAges);

        return i/2;
    }
}
