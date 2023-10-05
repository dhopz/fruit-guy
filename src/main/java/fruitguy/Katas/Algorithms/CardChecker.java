package fruitguy.Katas.Algorithms;

import java.util.Objects;

public class CardChecker {
    public static String getIssuer(String cardNumber) {
        // Your code here!

        String visa = "4+(\\d{15}|\\d{12})";
        String amex = "(34|37)+\\d{13}";
        String discover = "6011+\\d{12}";
        String mastercard = "(51|52|53|54|55)+\\d{14}";

        String result = "Unknown";
        if (cardNumber.matches(visa)) return "VISA";
        if (cardNumber.matches(amex)) return "AMEX";
        if (cardNumber.matches(discover)) return "Discover";
        if (cardNumber.matches(mastercard)) return "Mastercard";

        return result;
    }


    public static String getIssuerMySolution(String cardNumber) {
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
