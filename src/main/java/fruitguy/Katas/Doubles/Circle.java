package fruitguy.Katas.Doubles;

public class Circle {
    //https://www.codewars.com/kata/537baa6f8f4b300b5900106c/java
    public static double area(double radius) {
        if(radius <= 0 ) {
            throw new IllegalArgumentException();
        } else {
            return Math.round(Math.PI * Math.pow(radius,2.0)*1000)/1000.0;
        }
    }
}
