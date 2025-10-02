class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count= numBottles;

        while(numBottles >= numExchange){
            
            numBottles= numBottles-numExchange+1;
            count++;
            numExchange++;
            //numBottles++;
        }
        return count;
    }
}