class Solution {
    public int countPartitions(int[] nums) {
        int [] pref= new int [nums.length];
        int count=0;
        int n= nums.length;
        pref[0]= nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]= pref[i-1]+nums[i];
        }

        for(int i=0;i<pref.length-1;i++){
            int sum= pref[i]-(pref[n-1]-pref[i]);
            if(sum % 2==0) count++;
        }
        return count;
    }
}