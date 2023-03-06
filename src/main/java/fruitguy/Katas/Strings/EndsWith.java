package fruitguy.Katas.Strings;

public class EndsWith {
    public static boolean solution(String str, String ending) {
        //https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/java
        if (str.length()>= ending.length()){
            String toCheck = str.substring(str.length() - ending.length()).toLowerCase();
            return toCheck.equals(ending);
        } else {
            return false;
        }

    }

    public static boolean bestSolution(String str, String ending) {
        return str.endsWith(ending);
    }


}
