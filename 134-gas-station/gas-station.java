class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int gasleft=0;
        int posi=0;
        int n=gas.length;

        for(int i=0;i<n;i++){
            gasleft += gas[i]-cost[i];

            if(gasleft < 0){
                total += gasleft;
                gasleft=0;
                posi=i+1;
            }
        }
        total += gasleft;
        if(total >= 0) return posi;
          
        return -1;

    }
}