class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        if(costs[0]>coins) return 0;
        int s=0;
        int i=0;
        int c=coins;

        for(int k:costs){
            if(k<=c){
                s+=k;
                c=c-k;
                i++;
            }
        }
        return i;
    }
}