package fruitguy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String[] rotten = new String []{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"};

//        System.out.println(Arrays.toString(removeRotten(rotten)));
//        System.out.println(Arrays.toString(bestSolution(rotten)));

//        System.out.println(generateShape(7));
        System.out.println(Arrays.toString(scrollingText("codewars")));
    }

    public static String[] removeRotten(String[] fruitBasket){
        List<String> newFruit = new ArrayList<>();
        if (fruitBasket != null ) {
            for (String fruit : fruitBasket) {
                String fruit2 = fruit.replace("rotten", "");
                char[] c = fruit2.toCharArray();
                c[0] = Character.toLowerCase(c[0]);
                String lowerFruit = new String(c);
                newFruit.add(lowerFruit);
            }
            return newFruit.toArray(new String[0]);
        }
        return newFruit.toArray(new String[0]);
    }

    public static String[] bestSolution(String[] fruitBasket) {
        if(fruitBasket == null || fruitBasket.length == 0) return new String[0];

        for(int i = 0; i < fruitBasket.length; i++)
            fruitBasket[i] = fruitBasket[i].replace("rotten", "").toLowerCase();

        return fruitBasket;
    }
    public static String generateShape(int n) {
        String a = "+".repeat(n) + "\n";

        return a.repeat(n-1) + "+".repeat(n);
    }
    //"ODEWARSC"
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
