package fruitguy.Katas;

public class Vapor {
    public static String vaporCode(String s) {
        String newS =  s.replaceAll("\\s+","").toUpperCase();
        return newS.replace("", "  ").trim();
    }
}
