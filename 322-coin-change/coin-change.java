class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]= new int [amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]= 0;

        for(int c:coins){
            for(int i=1;i<=amount;i++){
                if(i-c>=0){
                dp[i]= Math.min(dp[i],dp[i-c]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}