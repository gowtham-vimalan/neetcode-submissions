class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = (row * col) - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            int rowIdx = middle / col;
            int colIdx = middle % col;

            if (matrix[rowIdx][colIdx] == target) {
                return true;
            } else if (matrix[rowIdx][colIdx] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }

        }
        return false;

    }
}
