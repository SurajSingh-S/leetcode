class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int [] left= new int [nums.length];
        int [] right= new int [nums.length];
        int n = nums.length;

        for(int i=0;i<n;i++){
            left[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    left[i]=Math.max(left[i],left[j]+1);
                }
            }
        }

        for(int i=n-1;i>=0;i--){
            right[i]=1;
            for(int j=n-1;j>i;j--){
                if(nums[i]>nums[j]){
                    right[i]=Math.max(right[i],right[j]+1);
                }
            }
        }

        int maxmount=0;
        for(int i=1;i<n-1;i++){
            if(left[i]>1 && right[i]>1){
                maxmount=Math.max(maxmount,left[i]+right[i]-1);
            }
        }
        return n-maxmount;
    }
}