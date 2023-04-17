package fruitguy.Katas.Arrays;

public class OddsOrEvens {
    public static String oddOrEven (int[] array) {
//        https://www.codewars.com/kata/5949481f86420f59480000e7/java
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum % 2 == 0 ? "even" : "odd";
    }
}
