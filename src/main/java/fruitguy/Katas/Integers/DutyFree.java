package fruitguy.Katas.Integers;

public class DutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        double cost = normPrice * (double)discount/100;
        return (int) (hol/cost);

    }
}
