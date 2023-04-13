package fruitguy.Katas.Integers;

public class DigitalRoot {
    //https://www.codewars.com/kata/541c8630095125aba6000c00/java
    //https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/java
    public static int digital_root(long n) {
        int persistence = 0;
        while(n > 9) {
            int sum = 1;
            while (n > 0) {
                sum *= n % 10;
                n /= 10;
            }
            n = sum;
            persistence ++;
        }
        return (int) persistence;
    }
}
