class Solution {
    public int maxSubArray(int[] nums) {
        int max= nums[0];
        int prevsum=nums[0];

        for(int i=1;i<nums.length;i++){
            prevsum= Math.max(nums[i],nums[i]+prevsum);
            max=Math.max(max,prevsum);
        }
        
        return max;
    }
}