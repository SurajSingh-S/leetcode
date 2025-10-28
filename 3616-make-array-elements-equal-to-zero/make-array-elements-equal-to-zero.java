class Solution {
    public int countValidSelections(int[] nums) {
        int count=0;
        int n= nums.length;
        int [] left= new int [n];
        int [] right= new int [n];

        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i-1];
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];
        }


        for(int i=0;i<n;i++){
            if(nums[i]!=0) continue;
            if(left[i]==right[i]) count+=2;
            else if(Math.abs(left[i]-right[i])==1) count+=1;
        }
        return count;
    }
}