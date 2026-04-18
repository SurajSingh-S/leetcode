class Solution {
    public int mirrorDistance(int n) {
        int m=n;
        int r=0;
        int sum=0;
        while(n>0){
            r= n%10;
            sum= sum*10+r;
            n=n/10;
        }
        return Math.abs(m-sum);
    }
}