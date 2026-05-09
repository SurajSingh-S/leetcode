class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest= nums[0] + nums[1] + nums[2];

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int start=i+1;
            int end=nums.length-1;

            while(start<end){
                int total= nums[i]+nums[start]+nums[end];

                if(Math.abs(target-total)<Math.abs(closest-target))
                   closest=total;
                
                if(total==target) return target;

                else if (total<target) start++;
                else end--;
           }            
        }
        return closest;
    }
}