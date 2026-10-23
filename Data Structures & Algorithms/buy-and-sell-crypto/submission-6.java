class Solution {
    public int maxProfit(int[] prices) {
        int costPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i : prices) {
            if(i < costPrice){
                costPrice = i;
            }else{
               maxProfit = Math.max(maxProfit, i - costPrice);
            }
        }
        return maxProfit;
    }
}
