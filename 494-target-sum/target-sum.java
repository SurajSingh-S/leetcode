class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;

        for(int i:nums){
            sum+=i;
        }

        if((target+sum)%2 !=0 || Math.abs(target)>sum){
            return 0;
        }

        int subsetsum= (target +sum)/2;

        int [] dp= new int [subsetsum+1];
        dp[0]=1;

        for(int n:nums){
            for(int i=subsetsum;i>=n;i--){
                dp[i]=dp[i]+dp[i-n];
            }
        }
        return dp[subsetsum];
    }
}