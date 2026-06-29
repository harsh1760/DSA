class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy < prices[i]) {
               int pro = prices[i]-buy;
                profit = Math.max(profit, pro);               
              
            }else{
                 buy = prices[i];
            }
        }
       return profit;

    }
}