class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n= happiness.length;
        Arrays.sort(happiness);
        long sum=0;
        int m=0;

        for(int i=n-1;i>=0;i--){
            if(m!= k){
                if (happiness[i] - m <= 0) break;
                sum = sum+ happiness[i]-m;
                m++;
            }
            else
                break;

        }
        return sum;

    }
}