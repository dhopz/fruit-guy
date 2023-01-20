package fruitguy.Katas.Strings;

public class Stratholme {
    // Remove character before and after the letter i
    public static String purify(String s) {
        return s.replaceAll("\\w?[iI]+\\w?", "").replaceAll("\\s+", " ").trim();
    }
}
