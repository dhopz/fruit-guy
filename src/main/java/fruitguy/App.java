package fruitguy;

import java.util.Arrays;
import java.util.Objects;

import static fruitguy.Katas.Algorithms.ChessChecker.canBishopMove;

public class App {
    public static void main(String[] args) {
        System.out.println(getIssuer("5405105105105106"));
    }

    public static String getIssuer(String cardNumber) {
        //https://www.codewars.com/kata/5701e43f86306a615c001868/train/java
        int number = Integer.parseInt(String.valueOf(cardNumber.charAt(0)));
        String cardType = "Unknown";

        switch (number) {
            case 3:
                if(cardNumber.length() == 15 && "34".equals(cardNumber.substring(0,2)) || "37".equals((cardNumber.substring(0,2)))) {
                    cardType = "AMEX";
                }
                break;
            case 6:
                if("6011".equals(cardNumber.substring(0,4)) && cardNumber.length() == 16) {
                    cardType = "Discover";
                }
                break;
            case 5:
                String[] master = new String[]{"51","52","53","54","55"};
                for (String numbers: master){
                    if (Objects.equals(cardNumber.substring(0, 2), numbers) && cardNumber.length() == 16) {
                        cardType = "Mastercard";
                        break;
                    }
                }
                break;
            case 4:
                if(cardNumber.length()==16 || cardNumber.length() == 13){
                    cardType = "VISA";
                }
                break;
            default:
                cardType = "Unknown";
        }
        return cardType;
    }



}
















