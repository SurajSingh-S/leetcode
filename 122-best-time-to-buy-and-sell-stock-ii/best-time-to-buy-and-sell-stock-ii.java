class Solution {
    public int maxProfit(int[] prices) {
        int min= prices[0];
        int profit=0;

        for(int i=1;i<prices.length;i++){
            int k= prices[i]- prices[i-1];
            if(prices[i]> prices[i-1]){
                profit+= k;
            }
        }
        return profit;
    }
}