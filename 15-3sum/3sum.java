class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        int n=nums.length;
        
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            if( i>0 && nums[i]==nums[i-1]) continue;

            int start=i+1;
            int end=nums.length-1;

            while(start <end){

            int total= nums[i]+nums[start]+nums[end];
            
            if(total==0){
                res.add(Arrays.asList(nums[i],nums[start],nums[end]));

                while(start<end && nums[start]==nums[start+1]){
                    start++;
                }

                while(start <end && nums[end]==nums[end-1]){
                    end--;
                }
                start++;
                end--;
            }
            else if(total<0){
                start++;
            }
            else end--;
            }
        }
        return res;
    }
}