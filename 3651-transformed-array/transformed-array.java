class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int [] res= new int [nums.length];

        for(int i =0;i<nums.length;i++){
            if (nums[i] == 0) {
                res[i] = nums[i];
            }

            else {
                int target= (i+nums[i])%nums.length;
                if(target < 0) target+=nums.length;
                res[i]=nums[target];
            }
        }
        return res;
    }
}