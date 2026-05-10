class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length==1) return 0;
        if(isSorted(nums)) return 0;

        int left =0;
        int right=0;

        for(int i=0;i<=nums.length-2;i++){
            if(nums[i]>nums[i+1]){
                left=i;
                break;
            }
        }

        for(int i=nums.length-1;i>0;i--){
            if(nums[i]<nums[i-1]){
                right=i;
                break;
            }
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = left; i <= right; i++) {

            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        // expand left
        while(left > 0 && nums[left - 1] > min) {
            left--;
        }

        // expand right
        while(right < nums.length - 1 && nums[right + 1] < max) {
            right++;
        }
        
        return right-left+1;
    }

    public boolean isSorted(int[] nums) {

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}