package fruitguy.Katas.Algorithms;

public class TicTacToeChecker {
    public static int isSolved(int[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                if (board[i][0] == 1) {
                    return 1;
                } else if (board[i][0] == 2) {
                    return 2;
                }
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                if (board[0][i] == 1) {
                    return 1;
                } else if (board[0][i] == 2) {
                    return 2;
                }
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (board[0][0] == 1) {
                return 1;
            } else if (board[0][0] == 2) {
                return 2;
            }
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            if (board[0][2] == 1) {
                return 1;
            } else if (board[0][2] == 2) {
                return 2;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return -1;
                }
            }
        }

        return 0;
    }

}
