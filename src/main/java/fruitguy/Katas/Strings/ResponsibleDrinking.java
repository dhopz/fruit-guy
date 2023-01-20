package fruitguy.Katas.Strings;

public class ResponsibleDrinking {
    public static String hydrate(String drinkString) {
        String str = drinkString.replaceAll("\\D+", "");
        int num = Integer.parseInt(str);
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        if (sum == 1) {
            return "1 glass of water";
        } else {
            return sum + " glasses of water";
        }
    }
}
