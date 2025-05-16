class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        //if(n>10) n= 10;

        int [] dp = new int [n+1];
        dp[0]=1;
        dp[1]=9;
        int res=10;

        for(int i=2;i<n+1;i++){
            dp[i]=dp[i-1]*(11-i);
            res+= dp[i];
        }
        return res;
    }
}