package fruitguy.Katas.Booleans;

public class XO {
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
        int x = 0;
        int o = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.toUpperCase().charAt(i) == 'O') o++;
            if(str.toUpperCase().charAt(i) == 'X') x++;
        }
        return x == o;
    }


}
