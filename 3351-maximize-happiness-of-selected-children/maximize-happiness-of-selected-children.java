class Solution {
    public long maximumHappinessSum(int[] hapiness, int k) {
        int [] arr= new int [k];
        int n= hapiness.length;
        k=Math.min(k,n);
        Arrays.sort(hapiness);

        for(int i=0;i<k;i++){
            arr[i]=hapiness[n-i-1];
        }

        long sum=0;
        for(int i=0;i<k;i++){
            sum+= Math.max(0,arr[i]-i);
        }
        return sum;
    }
}