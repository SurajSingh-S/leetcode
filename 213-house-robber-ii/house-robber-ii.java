class Solution {
    public int rob(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int option1 = helper(nums, 0, nums.length - 2);
        int option2 = helper(nums, 1, nums.length - 1);

        return Math.max(option1, option2);
    }

    public int helper(int [] nums,int start,int end){
        int [] dp= new int [nums.length];

        if (start == end) return nums[start];
        dp[start]=nums[start];
        dp[start+1]=Math.max(nums[start],nums[start+1]);

        for(int i=start+2;i<nums.length;i++){
            
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
            
        }
        return dp[end];

    }
}