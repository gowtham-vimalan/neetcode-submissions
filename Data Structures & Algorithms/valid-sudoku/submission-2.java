class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char val = board[i][j];
                if (val == '.') {
                    continue;
                }
                if (!seen.add(val + "in row" + i)) {
                    return false;
                }

                if (!seen.add(val + "in col" + j)) {
                    return false;
                }

                if (!seen.add(val + "in box" + (i / 3) + " - " + (j / 3))) {
                    return false;
                }
            }
        }
        return true;
    }
}
