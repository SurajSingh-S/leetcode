class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        List<List<Integer>> res= new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            subarray(nums, i, new ArrayList<>(), res);
        }
        
        Set<List<Integer>> s= new HashSet<>();

        for(List<Integer> currentlist:res){
            int count=0;
            for(int i:currentlist){
                if(i%p==0){
                    count++;
                }
            }
            if(count <=k){
                s.add(new ArrayList<>(currentlist));
            }
        }

        return s.size();

    }

    public void subarray(int []nums,int start,List<Integer>current,List<List<Integer>> res){
        for(int i=start;i<nums.length;i++){
            current.add(nums[i]);
            res.add(new ArrayList<>(current));
            // subarray(nums,i+1,current,res);
            // current.remove(current.size()-1);
        }
        
    }
}