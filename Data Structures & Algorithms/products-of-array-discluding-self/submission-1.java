class Solution {
public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] res1 = new int[nums.length];
        int leftProduct = 1;
        res[0] = leftProduct;
        for (int i = 1; i < nums.length; i++) {
             leftProduct = leftProduct * nums[i-1];
             res[i] = leftProduct;
        }

        int rightProduct = 1;
        res1[res.length - 1] = rightProduct;
        for (int i = res1.length - 2; i >= 0; i--) {
            rightProduct = rightProduct * nums[i+1];
            res1[i] = rightProduct;
        }


        for (int i = 0; i < nums.length; i++) {
            res[i] = res[i] * res1[i];
        }


        return res;

    }
}  
