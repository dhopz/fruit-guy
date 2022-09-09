package fruitguy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
//        System.out.println(negativeToNext5(-770342));
//        System.out.println(positiveToNext5(32));

        System.out.println(roundToNext5(121));
        System.out.println(bestSolutionRoundToNext5(-13265));

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

    public static boolean getXO (String str) {
        String text = str.toLowerCase();
        char firstValue = 'x';
        char secondValue = 'o';
        int countX = 0;
        int countY = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)==firstValue){
                ++countX;
            }
            if (text.charAt(i)==secondValue){
                ++countY;
            }
        }
        return countY == countX;
    }

    public static boolean betterSolutionXO (String str){
        int x = 0, o = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.toUpperCase().charAt(i) == 'O') o++;
            if(str.toUpperCase().charAt(i) == 'X') x++;
        }
        return x == o;
    }

    public static List<Integer> splitDigits(Integer number){
        String[] list = String.valueOf(number).split("");
        List<Integer> numberList = new ArrayList<>();
        for(String s : list) {
            numberList.add(Integer.valueOf(s));
        }
        return numberList;
    }

    public static boolean upToZero(int[] toZero,int lastDigit){
        return IntStream.of(toZero).anyMatch(x -> x == lastDigit);
    }

    public static boolean upToFive(int[] toFive, int lastDigit){
        return IntStream.of(toFive).anyMatch(x -> x == lastDigit);
    }

    public static void listOfDigits(List<Integer> numberList, int numberToRoundTo){
        numberList.set(numberList.size() - 1, numberToRoundTo);
    }

    public static List<Integer> roundingListCheck(int lastDigit, int[] toZero, int[] toFive, List<Integer> numberList){
        if (upToZero(toZero,lastDigit)) {
            listOfDigits(numberList,0);
        }

        if (upToFive(toFive,lastDigit)) {
            listOfDigits(numberList,5);
        }
        return numberList;
    }
    public static int createTotal(List<Integer> numberList){
        StringBuilder sb = new StringBuilder();
        for (Integer x : numberList) {
            sb.append(x.toString());
        }
        return Integer.parseInt(String.valueOf(sb));
    }
    public static int roundToNext5(int number){
        int lastDigit = number%10;

        if (lastDigit==0){
            return number;
        }
        if (number > 0){
            return positiveToNext5(number);
        } else {
            return negativeToNext5(number);
        }
    }
    public static int negativeToNext5(int number){
        int[] toZero = new int[]{1,2,3,4};
        int[] toFive = new int[]{6,7,8,9};

        int newNum = Math.abs(number);
        int lastDigit = newNum%10;

        List<Integer> checkedList = roundingListCheck(lastDigit,toZero,toFive,splitDigits(newNum));
        return createTotal(checkedList)*-1;
    }

//    public static int singleDigitChecker()
    public static int positiveToNext5(int number) {
        int[] toZero = new int[]{6,7,8,9};
        int[] toFive = new int[]{1,2,3,4};
        List<Integer> numberList = splitDigits(number);

        int lastDigit = number%10;

        boolean upToZero = IntStream.of(toZero).anyMatch(x -> x == lastDigit);
        boolean upToFive = IntStream.of(toFive).anyMatch(x -> x == lastDigit);

        if (numberList.size()>1) {
            if (upToZero) {
                numberList.set(numberList.size() - 1, 0);
                int newNum = numberList.get(numberList.size() - 2) + 1;
                numberList.set(numberList.size() - 2, newNum);
            }

            if (upToFive) {
                numberList.set(numberList.size() - 1, 5);
            }
        } else{
            if(upToZero){
                numberList.set(0,10);
            }
            if(upToFive){
                numberList.set(0,5);
            }
        }

        return createTotal(numberList);
    }
        public static int bestSolutionRoundToNext5(int number) {
            while (number % 5 != 0) {
                number++;
            }
            return number;
        }
    }



