package fruitguy.Katas;

public class Deodorant {
    public int calculateExpiry(double content, double evaporation, double threshold) {
        int result = 0;
        double percentage = 100;
        while (percentage > threshold) {
            percentage -= percentage*(evaporation/100);
            result++;
        }

        return result;
    }

}
