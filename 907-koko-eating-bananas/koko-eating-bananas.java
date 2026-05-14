class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=0;

        for(int i:piles){
            end=Math.max(i,end);
        }

        while(start<=end){
            int mid= start+(end-start)/2;
            long totalhours=calculatebanana(piles,mid);

            if(totalhours<=h){
                end=mid-1;
            }
            else start=mid+1;
        }
        return start;
    }

    public long calculatebanana(int []piles,int speed){
        long hours=0;
        for(int banana: piles){
            hours = hours+ ((long)banana+speed-1)/speed;
        }
        return hours;
    }
}