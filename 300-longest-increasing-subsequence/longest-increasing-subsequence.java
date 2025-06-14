class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int [] dp= new int [nums.length];
        Arrays.fill(dp,1);

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }

        int len=0;
        for(int i:dp){
            len=Math.max(i,len);
        }
        return len;
    }
}