class Solution {
        public int maxProfit(int[] prices) {
        int i = 0; // buy day
        int j = 1; // sell day
        int maxProfit = 0;

        while (j < prices.length) {
            if (prices[j] > prices[i]) {
                // profitable sell
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            } else {
                // better buy day found
                i = j;
            }
            j++;
        }

        return maxProfit;
    }
}
