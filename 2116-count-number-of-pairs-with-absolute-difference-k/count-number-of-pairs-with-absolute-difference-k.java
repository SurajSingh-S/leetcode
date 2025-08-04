class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;

        for(int i:nums){
            if(map.containsKey(i-k)) {
                count+=map.get(i-k) ;
            }
        }
        return count;
    }
}