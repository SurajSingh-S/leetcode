class Solution {
    public int maxProfit(int[] prices) {
        int minprice= Integer.MAX_VALUE;
        int maxprofit=0;

        for(int p:prices){
            if(p < minprice){
                minprice=p;
            }

            int profit=p-minprice;

            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;

    }
}