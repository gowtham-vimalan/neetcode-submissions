class Solution {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int max = 1;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                continue;
            }
                if (nums[i - 1] + 1 == nums[i]) {
                    res++;
                } else {
                    max = Math.max(res, max);
                    res = 1;
                }
        }
        return Math.max(res, max);
    }
}
