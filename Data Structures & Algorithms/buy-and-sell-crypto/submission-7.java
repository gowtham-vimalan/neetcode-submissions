class Solution {
    public int maxProfit(int[] prices) {
        int costPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (costPrice > price) {
                costPrice = price;
            } else {
                profit = Math.max(profit, price - costPrice);
            }
        }

        return profit;

    }
}
