
package fruitguy.Katas.Strings;

public class CaffeineBuzz {
    public static String caffeine(int n){
        if(n % 3 == 0 && n % 4 == 0){
            return "CoffeeSc";
        } else if (n % 3 == 0 && n % 2 == 0) {
            return "JavaScript";
        } else if (n % 3 == 0) {
            return "Java";
        } else {
            return "mocha_missing!";
        }
    }

    public static String caffeineBestSolution(int n){
        String message = "mocha_missing!";
        if(n != 0) {
            if(n % 3 ==0) message = "Java";
            if(n % 12 ==0) message = "Coffee";
            if(n % 2 ==0) message += "Script";
        }
        return message;
    }
}
