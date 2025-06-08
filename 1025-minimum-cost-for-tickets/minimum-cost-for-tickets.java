class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n= days.length;
        int maxday= days[n-1];

        boolean []traveldays= new boolean[maxday+1];
        for(int i:days){
            traveldays[i]=true;
        }

        int []dp= new int [maxday+1];

        for(int i=1;i<=maxday;i++){
            if(!traveldays[i]){
                dp[i]=dp[i-1];
            }
            else{
                int firstday= dp[Math.max(0,i-1)]+costs[0];
                int secondday= dp[Math.max(0,i-7)]+costs[1];
                int thirdday=dp[Math.max(0,i-30)]+costs[2];

                dp[i]=Math.min(firstday,Math.min(secondday,thirdday));
            }

        }
        return dp[maxday];
    }
}