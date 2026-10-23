class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int maxProfit = 0;
        int i=0;
        for(int j=i+1;j<prices.length; j++){
            if(prices[j] < prices[i]) {
                i=j;
            }else{
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        return maxProfit;
    }
}
