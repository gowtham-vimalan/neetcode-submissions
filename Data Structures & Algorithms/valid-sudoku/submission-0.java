class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                char ch = board[r][c];
                if (ch == '.') continue;

                String rowKey = ch + " in row " + r;
                String colKey = ch + " in col " + c;
                String boxKey = ch + " in box " + (r/3) + "-" + (c/3);

                if (!set.add(rowKey) || !set.add(colKey) || !set.add(boxKey)) {
                    return false;
                }
            }
        }

        return true;
    }
}
