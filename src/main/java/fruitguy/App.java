package fruitguy;

public class App {
    public static void main(String[] args) {
        System.out.println(area(68));
        System.out.println(area(-1));

  }

  //https://www.codewars.com/kata/537baa6f8f4b300b5900106c/java
  public static double area(double radius) {
        if(radius <= 0 ) {
            throw new IllegalArgumentException();
        } else {
            return Math.round(Math.PI * Math.pow(radius,2.0)*1000)/1000.0;
        }
//        return Math.round(Math.PI * Math.pow(radius,2.0)*1000)/1000.0;
//        return radius <=0 ? new IllegalArgumentException() : Math.round(Math.PI * Math.pow(radius,2.0)*1000)/1000.0;
    }








}



