package fruitguy.Katas;

import java.util.ArrayList;
import java.util.List;



public class Text {
    public static String[] scrollingText(String word) {
        String text = word.toUpperCase();
        ArrayList<String> textVariables = new ArrayList<>();
        textVariables.add(text);
        ArrayList<Character> usedLetters = new ArrayList<>();
        for (int i = 0; i < text.length()-1; i++) {
            usedLetters.add(text.charAt(i));
            textVariables.add(text.substring(i+1)+letterCombo(usedLetters).toUpperCase());
        }
        return textVariables.toArray(new String[0]);
    }
    public static String letterCombo(List<Character> usedLetters){
        StringBuilder builder = new StringBuilder(usedLetters.size());
        for(Character ch: usedLetters){
            builder.append(ch);
        }
        return builder.toString();
    }
    public static String[] scrollingTextSolution(String text) {
        String[] result = new String[text.length()];
        StringBuilder stringBuilder = new StringBuilder(text.toUpperCase());
        for (int i = 0; i < result.length; i++) {
            result[i] = stringBuilder.toString();
            stringBuilder.append(stringBuilder.charAt(0)).deleteCharAt(0);
        }
        return result;
    }
}
