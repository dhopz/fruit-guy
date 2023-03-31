package fruitguy.Katas.Strings;

public class DashInserter {
    //https://www.codewars.com/kata/55960bbb182094bc4800007b
    public static String insertDash(int num){
        String strNumber = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        boolean lastDigitWasOdd = false;

        for (int i = 0; i<strNumber.length(); i++){
            int digit = Character.getNumericValue(strNumber.charAt(i));

            if(digit % 2 != 0) {
                if (lastDigitWasOdd) {
                    sb.append("-");
                }
                lastDigitWasOdd = true;
            } else {
                lastDigitWasOdd = false;
            }
            sb.append(digit);
        }
        return sb.toString();
    }
}
