package fruitguy;

import static fruitguy.Katas.Strings.EndsWith.solution;
import static fruitguy.Katas.Strings.GreetMe.greet;

public class App {
    public static void main(String[] args) {
//        System.out.println(weatherInfo(50));
//        System.out.println(weatherInfo(23));
//        System.out.println(replaceDots("one.two.three"));
//        System.out.println(solution("samurai", "ai"));
//        System.out.println(solution("sumo", "omo"));
//        System.out.println(solution("!@#$%^&*() :-)", ":-)"));
//        System.out.println(solution("abc", "abcd"));
        System.out.println(firstNonRepeated("test"));
//        System.out.println(firstNonRepeated("TEETER"));

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

    public static Character firstNonRepeated(String source) {
        //https://www.codewars.com/kata/570f6436b29c708a32000826/train/java
        Character s = source.charAt(0);
        for(int i = 1; i < source.length(); i++){
            if(s.equals(source.charAt(i))){
                System.out.println(source.charAt(i)+ " hello");
                s = source.charAt(i);
            }
        }
        System.out.println(s + " result");
        return s;
    }



}



