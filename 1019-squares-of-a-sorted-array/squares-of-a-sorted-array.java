class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] res= new int [n];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        int start=0;
        int end=nums.length-1;
        int index=n-1;

        while(start<=end){
            if(nums[start]>=nums[end]){
                res[index]=nums[start];
                start++;
            }
            else {
                 res[index]=nums[end];
                 end--;
            }
            index--;   
        }
        return res;
    }
}