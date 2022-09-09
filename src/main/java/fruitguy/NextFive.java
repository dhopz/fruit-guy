package fruitguy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class NextFive {
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
