class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if(n<k) return 0;

        Set<Integer> s= new HashSet<>();
        long sum=0,maxsum=0;
        int left=0;

        for(int i=0;i<nums.length;i++){
            while(s.contains(nums[i])){
                s.remove(nums[left]); 
                sum -= nums[left];               
                left++;
            }

            s.add(nums[i]);
            sum+= nums[i];

            if(s.size()==k){
                maxsum=Math.max(sum,maxsum);
                s.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }
        return maxsum;
    }
}