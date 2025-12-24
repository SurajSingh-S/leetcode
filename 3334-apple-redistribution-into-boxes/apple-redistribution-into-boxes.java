class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        
        int sum=0;
        int capsum=0;
        int count=0;

        for(int i:apple){
            sum += i;
        }
        
        int k=capacity.length-1;
        Arrays.sort(capacity);
        while(k >=0 && capsum < sum){
            capsum += capacity[k];
            k--;
        }
        return capacity.length-1-k;
    }
}