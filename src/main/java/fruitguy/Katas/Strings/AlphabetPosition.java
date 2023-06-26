package fruitguy.Katas.Strings;

public class AlphabetPosition {
    public static String position(char alphabet){
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        return "Position of alphabet: " + (alpha.indexOf(alphabet) + 1);
    }
}
