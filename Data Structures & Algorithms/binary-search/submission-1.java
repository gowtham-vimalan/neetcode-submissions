class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int middle = start + ((end - start) / 2);
            int middleEle = nums[middle];

            if (middleEle == target) {
                return middle;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
