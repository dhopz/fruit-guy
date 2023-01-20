package fruitguy.Katas.Strings;

public class FilterString {
    //https://www.codewars.com/kata/55b051fac50a3292a9000025/java
    public static long filterString(final String value) {
        if (value.contains("[a-zA-Z]+")){
            return Long.parseLong(value);
        } else {
            String str = value.replaceAll("\\D+", "");
            return Long.parseLong(str);
        }
    }

    public static long bestSolutionFilterString(final String value) {
        return Long.parseLong(value.replaceAll("\\D", ""));
    }


}
