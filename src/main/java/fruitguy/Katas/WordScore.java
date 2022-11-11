package fruitguy.Katas;

public class WordScore {
    public String returnScore(String word) {
        String letters = "abcdefghijklmnopqrstuvwxyz";

        String positionOfHighest = null;
        int highestScore = 0;

        for (String s : word.split(" ")) {
            int wordScore = 0;
            for(String y:s.split("")){
                wordScore += letters.indexOf(y)+1;
            }
            if (wordScore > highestScore){
                highestScore = wordScore;
                positionOfHighest = s;
            }
        }

        return positionOfHighest;
    }
}
