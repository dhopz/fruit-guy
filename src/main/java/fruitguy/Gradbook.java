package fruitguy;

public class Gradbook {
    public char calculate(int i, int i1, int i2) {
        int averageScore = (i+i1+i2)/3;
        if(averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
