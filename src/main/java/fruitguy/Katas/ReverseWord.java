package fruitguy.Katas;

public class ReverseWord {
    public static String shorterReverseLonger(String a, String b) {
        if (a.length() >= b.length()){
            String reverse = new StringBuffer(a).reverse().toString();
            return b + reverse + b;
        } else {
            String reverse = new StringBuffer(b).reverse().toString();
            return a + reverse + a;
        }
//        String reverse = new StringBuffer(a).reverse().toString();
//        System.out.println(reverse);
//        return a;

    }
}
