package fruitguy.Katas.Strings;

public class GreetMe {
    //https://www.codewars.com/kata/535474308bb336c9980006f2/java
    public static String greet(String name) {
        System.out.println("Hello Riley!");
        String cap = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        return "Hello " + cap + "!";
    }
}
