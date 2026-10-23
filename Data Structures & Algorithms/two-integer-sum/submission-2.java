class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsToIdxMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int pair = target - nums[i];
            if (numsToIdxMap.containsKey(pair)) {
                return new int[]{numsToIdxMap.get(pair), i};
            } else {
                numsToIdxMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
