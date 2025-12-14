class Solution {
    public int specialTriplets(int[] nums) {
        int n = nums.length;
        int mod= 1000000007;
        long count = 0;
        HashMap<Integer, Integer> leftMap = new HashMap<>();
        HashMap<Integer, Integer> rightMap = new HashMap<>();

        leftMap.put(nums[0],1);

        for(int j=2;j<nums.length;j++){
            rightMap.put(nums[j],rightMap.getOrDefault(nums[j],0)+1);
        }

        int i=1;
        while(i<n-1){

            int doubleVal = 2 * nums[i];

            if (leftMap.containsKey(doubleVal) && rightMap.containsKey(doubleVal)) {
                long x = leftMap.get(doubleVal);
                long y = rightMap.get(doubleVal);
                count = (count + (x * y) % mod) % mod;
            }

            leftMap.put(nums[i],leftMap.getOrDefault(nums[i],0)+1);

            //remove i+1 from right-
            int next= nums[i+1];
            if (rightMap.containsKey(next)) {
            rightMap.put(next, rightMap.get(next)-1);
                if(rightMap.get(next)==0){
                    rightMap.remove(next);
                }
            }
            i++;
        }
      
        return (int)count;
    }
}