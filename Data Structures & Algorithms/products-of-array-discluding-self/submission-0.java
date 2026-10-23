class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        int prefix = 1;
        int suffix = 1;
        for(int i=0; i<nums.length; i++) {
          results[i] = prefix;
          prefix = prefix * nums[i];
        }
        for(int i=nums.length - 1; i>=0; i--) {
          results[i] = results[i] * suffix;
          suffix = suffix * nums[i];
        }
        return results;

    }
}  
