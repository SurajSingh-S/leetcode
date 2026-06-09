class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long sum=0;

        long max=Integer.MIN_VALUE;
        long min= Integer.MAX_VALUE;

        for(int i:nums){
            if(i>max){
                max=i;
            }
        }

        for(int i:nums){
            if(i<min){
                min=i;
            }
        }
        
        sum=Math.abs(max-min);
        return sum*k;

    }
}