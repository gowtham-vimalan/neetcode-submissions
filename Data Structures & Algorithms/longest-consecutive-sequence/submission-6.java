class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);

        int currentLength = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                continue;
            }

            if (nums[i + 1] == nums[i] + 1) {
                currentLength += 1;
                max = Math.max(currentLength, max);
            } else {
                currentLength = 1;
            }

        }
        return Math.max(max, currentLength);

    }
}
