package fruitguy;

class Shape {
    public static String generateShape(int n) {
        String a = "+".repeat(n) + "\n";
        return a.repeat(n-1) + "+".repeat(n);
    }
}
