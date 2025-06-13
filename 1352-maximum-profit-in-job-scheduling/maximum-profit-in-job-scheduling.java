class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n= profit.length;
        int [][] jobs= new int[n][3];

        for(int i=0;i<n;i++){
            jobs[i]=new int[] {startTime[i],endTime[i],profit[i]};
        }

        Arrays.sort(jobs,(a,b)->a[1]-b[1]);

        int []dp= new int [n];
        dp[0]=jobs[0][2];

        for(int i=1;i<n;i++){
            int currentprofit=jobs[i][2];

            for(int j=i-1;j>=0;j--){
                if(jobs[i][0]>=jobs[j][1]){
                    currentprofit+= dp[j];
                    break;
                }
            }
            dp[i]=Math.max(dp[i-1],currentprofit);
        }
        return dp[n-1];
    }
}