package fruitguy;

import java.util.Arrays;
import java.util.Objects;

import static fruitguy.Katas.Algorithms.CardChecker.getIssuer;
import static fruitguy.Katas.Algorithms.TicTacToeChecker.isSolved;

public class App {
    public static void main(String[] args) {
        int [][] board = new int[][] {
                {0, 0, 1},
                {0, 1, 2},
                {2, 1, 0}
        };
        System.out.println(isSolved(board));

        int[][] newBoard = new int[][] {
                {1, 1, 1},
                {0, 2, 2},
                {0, 0, 0}
        };
        System.out.println(isSolved(newBoard));
    }





    }























