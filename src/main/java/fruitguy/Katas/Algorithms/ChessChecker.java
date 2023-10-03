package fruitguy.Katas.Algorithms;

public class ChessChecker {
    //https://www.codewars.com/kata/6135e4f40cffda0007ce356b/java
    public static boolean canBishopMove(String start, String end, int n) {
        // Check if the positions are valid on the chessboard
        if (!isValidPosition(start) || !isValidPosition(end) || n < 1) {
            return false;
        }

        // Convert the positions to coordinates
        int startX = start.charAt(0) - 'a';
        int startY = start.charAt(1) - '1';
        int endX = end.charAt(0) - 'a';
        int endY = end.charAt(1) - '1';

        // Calculate the absolute differences in coordinates
        int deltaX = Math.abs(endX - startX);
        int deltaY = Math.abs(endY - startY);

        // Check if the move is diagonal and within the allowed range (n)
        return deltaX == deltaY && deltaX <= n;
    }

    private static boolean isValidPosition(String position) {
        return position.length() == 2 && position.matches("[a-h][1-8]");
    }

}
