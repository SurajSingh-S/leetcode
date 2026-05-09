class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;

        int current=1;
        int count=0;
        int right=0;
        int left=0;

        while(right <nums.length){
            current=current*nums[right];

            while(current>=k){
                current=current/nums[left];
                left++;
            }
            count+= (right-left)+1;
            right++;
        }
        return count;
    }
}