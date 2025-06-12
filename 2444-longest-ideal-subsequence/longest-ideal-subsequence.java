class Solution {
    public int longestIdealString(String s, int k) {
         int [] dp= new int [26];
         int maxlen=0;
         for(char c:s.toCharArray()){
            int index= c-'a';
            int currmax=0;

            for(int i=Math.max(0,index-k);i<=Math.min(25,index+k);i++){
                currmax= Math.max(currmax,dp[i]);
            }
            dp[index]=currmax+1;
            maxlen=Math.max(maxlen,dp[index]);
        }
        return maxlen;
    }
}