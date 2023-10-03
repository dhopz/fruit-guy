package fruitguy;

import java.util.Arrays;

import static fruitguy.Katas.Algorithms.ChessChecker.canBishopMove;

public class App {
    public static void main(String[] args) {
        String positionStart = "a1";
        String positionEnd = "b4";
        int n = 2;
        boolean result = canBishopMove(positionStart, positionEnd, n);
        System.out.println("Can the bishop move? " + result); // Should print "true"
    }



    }
















