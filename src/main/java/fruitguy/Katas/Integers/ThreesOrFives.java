package fruitguy.Katas.Integers;

public class ThreesOrFives {
    public static int sumMultiples(int n){
        // https://www.codewars.com/kata/514b92a657cdc65150000006/java
        int sum = 0;
        for (int i = 1; i < n; i++){
            if (i % 3 == 0||i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
