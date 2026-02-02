class Solution {
    public int pivotIndex(int[] nums) {
        int [] prefix= new int [nums.length];
        prefix[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        int n=nums.length;

        if (prefix[n - 1] - prefix[0] == 0) {
            return 0;
        }

        for(int i=1;i< prefix.length;i++){
            int left= prefix[i-1];
            int right= prefix[n-1]-prefix[i];
            if(left == right) return i;
        }

        return -1;
    }
}