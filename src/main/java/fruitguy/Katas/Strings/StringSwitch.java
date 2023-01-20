package fruitguy.Katas.Strings;

public class StringSwitch {
    public static String switcheroo(String x) {
        return x.replaceAll("a","i").replaceAll("b","a").replaceAll("i","b");
    }
}
