package fruitguy.Katas;

public class ReplaceNth {
    //https://www.codewars.com/kata/57fcaed83206fb15fd00027a/java
    public static String replaceNth(String text, int n, char oldValue, char newValue) {
        StringBuilder result = new StringBuilder(text);
        char[] newStr =  text.toCharArray();
        int counter = 0;
        for (int i = 0; i < text.length(); i ++) {
            if (newStr[i] == oldValue){
                counter ++;
            }
            if (newStr[i] == oldValue && counter == n){
                result.setCharAt(i, newValue);
                counter = 0;
            }
        }
        return result.toString();
    }
}
