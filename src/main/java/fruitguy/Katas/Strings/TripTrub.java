package fruitguy.Katas.Strings;

public class TripTrub {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < one.length(); i++){
            newString.append(one.toCharArray()[i]);
            newString.append(two.toCharArray()[i]);
            newString.append(three.toCharArray()[i]);
        }


        return newString.toString();
    }
}
