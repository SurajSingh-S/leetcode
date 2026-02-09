class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return  helper(nums,upper)-helper(nums,lower-1);
    }

    public long helper(int []nums, long target){
        int start=0;
        int end= nums.length-1;
        long count=0;

        while(start<end){
            if(nums[start]+nums[end]<=target){
                count+= (end-start);
                start++;
            }
            else{
                end--;
            }
        }
        return count;
    }
}