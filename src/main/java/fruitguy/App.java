package fruitguy;

import static fruitguy.Katas.Strings.EndsWith.solution;
import static fruitguy.Katas.Strings.GreetMe.greet;

public class App {
    public static void main(String[] args) {
        System.out.println(weatherInfo(50));
        System.out.println(weatherInfo(23));
        System.out.println(replaceDots("one.two.three"));
        System.out.println(solution("samurai", "ai"));
        System.out.println(solution("sumo", "omo"));
        System.out.println(solution("!@#$%^&*() :-)", ":-)"));
        System.out.println(solution("abc", "abcd"));

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

    public static String replaceDots(final String str) {
        return str.replaceAll("\\.", "-");
    }



}



