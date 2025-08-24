class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
        int left=0;
        int zero=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0) zero++;

            while(zero==2) {
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            count=Math.max(count,right-left);
        }
        return count;
    }
}