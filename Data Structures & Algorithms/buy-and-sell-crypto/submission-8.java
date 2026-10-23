class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int costPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < costPrice) {
                costPrice = price;
            } else {
                profit = Math.max(profit, price - costPrice);
            }
        }
        
        return profit;
    }
}
