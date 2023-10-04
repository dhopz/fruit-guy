package fruitguy;

import java.util.Arrays;

import static fruitguy.Katas.Algorithms.ChessChecker.canBishopMove;

public class App {
    public static void main(String[] args) {
        System.out.println(getIssuer("411111"));
//        System.out.println(getIssuer("378282246310005"));
        System.out.println(getIssuer("4111111111111111"));
        System.out.println(getIssuer("4111111111111"));
    }

    public static String getIssuer(String cardNumber) {
        //https://www.codewars.com/kata/5701e43f86306a615c001868/train/java
        int number = Integer.parseInt(String.valueOf(cardNumber.charAt(0)));
        String cardType = null;

        switch (number) {
            case 3:
                cardType = "AMEX";
                break;
            case 6:
                cardType = "Discover";
                break;
            case 5:
                cardType = "Mastercard";
                break;
            case 4:
                if(cardNumber.length()==16 || cardNumber.length() == 13){
                    cardType = "VISA";
                } else {
                    cardType = "Unknown";
                }
                break;
            default:
                cardType = "Unknown";
        }
        return cardType;
    }



}
















