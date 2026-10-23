class Solution {
    public static int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int potentialElement = array[middle];

            int leftElement = array[left];
            int rightElement = array[right];

            if (potentialElement == target) {
                return middle;
            } else if (leftElement <= potentialElement) {
                if (target >= leftElement && target < potentialElement) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (target <= rightElement && target > potentialElement) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }

        }

        return -1;
    }
}