class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n= nums.size();
        int inc =1;
        int previnc=0;
        int maxlen=0;

        for(int i=1;i<n;i++){
            if(nums.get(i)>nums.get(i-1)) inc++;

            else{
                previnc= inc;
                inc=1;
            }

            maxlen=Math.max(maxlen,Math.max(inc/2, Math.min(previnc,inc)));
            if(maxlen >= k ) return true;
        }
        return false;
    }
}