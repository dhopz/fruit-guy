package fruitguy.Katas.Integers;

public class DigitalRoot {
    //https://www.codewars.com/kata/541c8630095125aba6000c00/java
    public static int digital_root(int n) {
        while(n > 9) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }
}
