import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        return checkColumns(board) && checkRows(board) && check3_3boxes(board);
    }

    public boolean checkColumns(char[][] board) {
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (set.contains(board[j][i])) {
                    return false;
                } else if (board[j][i] >= '0' && board[j][i] <= '9') {
                    set.add(board[j][i]);
                }
            }
            set.clear();
        }
        return true;
    }

    public boolean checkRows(char[][] board) {
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (set.contains(board[i][j])) {
                    return false;
                } else if (board[i][j] >= '0' && board[i][j] <= '9') {
                    set.add(board[i][j]);
                }
            }
            set.clear();
        }
        return true;
    }

    public boolean check3_3boxes(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                HashSet<Character> set = new HashSet<Character>();
                for (int k = 0; k < 3; k++) {
                    for (int m = 0; m < 3; m++) {
                        if (set.contains(board[i * 3 + k][j * 3 + m])) {
                            return false;
                        } else if (board[i * 3 + k][j * 3 + m] >= '0' && board[i * 3 + k][j * 3 + m] <= '9') {
                            set.add(board[i * 3 + k][j * 3 + m]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
