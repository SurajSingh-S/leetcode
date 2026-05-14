class Solution {
    public int maximumCandies(int[] candies, long k) {
        int start=1;
        int end=0;
        int res=0;

        for(int i:candies){
            end=Math.max(i,end);
        }
        while(start<=end){
            int mid=start+(end-start)/2;

            long children= candivide(candies,mid);
            if(children>=k){
                res=mid;
                start=mid+1;
                
            }
            else{
                end=mid-1;

            }
        }
        return res;

    }

    public long candivide(int []candies,int mid){
        long partition=0;

        for(int i:candies){
            partition+= i/mid;
        }
        return partition;
    }
}