package fruitguy;

import fruitguy.Katas.Booleans.surviveAttack;

public class App {
    public static void main(String[] args) {
//        System.out.println(surviveAttack.solutionBlock(new int[] { 4, 9, 18, 6, 45, 39, 6, 26, 19 }, new int[] { 5, 15, 7, 28, 50, 7, 34 }));
        System.out.println(weatherInfo(50));
        System.out.println(weatherInfo(23));

    }

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        System.out.println(c);
        if (c > 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        double celsius = (temperature - 32) * (5/9.0);
        System.out.println(celsius);
        return celsius;
    }



}



