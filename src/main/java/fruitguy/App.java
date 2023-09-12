package fruitguy;

public class App {
    public static void main(String[] args) {
        System.out.println(area(68));

  }

    public static double area(double radius) {
        return Math.round(Math.PI * Math.pow(radius,2.0)*1000)/1000.0;
    }








}



