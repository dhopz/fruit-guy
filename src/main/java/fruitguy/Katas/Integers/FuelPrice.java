package fruitguy.Katas.Integers;

public class FuelPrice {
    public static double fuelPrice(int litres, double pricePerLitre) {
        return litres * (pricePerLitre - Math.min(litres / 2 * 0.05, 0.25));
    }
}
