class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int sum=0;
        // for(int i:costs){
        //     sum+= i;
        // }

        // if(sum >=coins) return costs.length;

        int count=0;


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