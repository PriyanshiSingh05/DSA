class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_Profit = 0;
        for(int i = 0; i < prices.length ; i++){
            min_price = Math.min(min_price,prices[i]);
            int curr_P = prices[i] - min_price;
            max_Profit = Math.max(max_Profit , curr_P);

        }return max_Profit;
        
        
    }
}