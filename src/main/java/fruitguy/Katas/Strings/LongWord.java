package fruitguy.Katas.Strings;

public class LongWord {
    public static String longestWord(String wordString) {
        int wordLength = 0;
        String longestWord = null;
        for(String word: wordString.split(" ")){
            if(word.length() >= wordLength){
                wordLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }
}
