package fruitguy;

import java.util.Arrays;
import java.util.Objects;

import static fruitguy.Katas.Algorithms.CardChecker.getIssuer;

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

    public static int isSolved(int[][] board) {
        // Check rows, columns, and diagonals for a winner
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                if (board[i][0] == 1) {
                    return 1; // Player X wins
                } else if (board[i][0] == 2) {
                    return 2; // Player O wins
                }
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                if (board[0][i] == 1) {
                    return 1; // Player X wins
                } else if (board[0][i] == 2) {
                    return 2; // Player O wins
                }
            }
        }

        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (board[0][0] == 1) {
                return 1; // Player X wins
            } else if (board[0][0] == 2) {
                return 2; // Player O wins
            }
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            if (board[0][2] == 1) {
                return 1; // Player X wins
            } else if (board[0][2] == 2) {
                return 2; // Player O wins
            }
        }

        // Check for a draw or unfinished game
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return -1; // Game is not finished
                }
            }
        }

        return 0; // It's a draw
    }




    }























