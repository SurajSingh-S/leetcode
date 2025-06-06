class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left=0;
        int res=0;
        int count=0;
        int noofones=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] %2 !=0 ){
                noofones++;
                count=0;
            }
            while(noofones==k){
                count++;
                if(nums[left] %2 !=0){
                    noofones--;
                }
                left++;
            }
            res+=count;
        }
        return res;
    }
}