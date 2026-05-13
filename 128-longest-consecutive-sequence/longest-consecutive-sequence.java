class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int i: nums){
            set.add(i);
        }

        int count=0;

        for(int i:set){
            if(!set.contains(i-1)){
                int current=1;

                while(set.contains(i+current)){
                    current++;
                }
                count=Math.max(count,current);
            }
        }
        return count;
    }
}