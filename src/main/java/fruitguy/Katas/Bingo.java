package fruitguy.Katas;

public class Bingo {
    //https://www.codewars.com/kata/5a1ee4dfffe75f0fcb000145/java
    public static String bingo(int[] numberArray){
        StringBuilder str = new StringBuilder();
        for (int x: numberArray){
            str.append(getCharForNumber(x));
        }

        if (str.indexOf("B") != -1 && str.indexOf("I") != -1 && str.indexOf("N") != -1 && str.indexOf("G") != -1 && str.indexOf("O") != -1) {
            return "WIN";
        } else {
            return "LOSE";
        }
    }

    private static String getCharForNumber(int i) {
        return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
    }

}
