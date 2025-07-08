class Solution {
    public List<List<Integer>> combinationSum(int[] array, int target) {
        List<List<Integer>> res= new ArrayList();
        combination(0,array,target,new ArrayList(),res);
        return res;
        }

        public void combination(int start,int [] nums,int target,List<Integer> current,List<List<Integer>> res){
            if(target==0){
                res.add(new ArrayList(current));
            }
            if(target<0){
                return;
            }
            for(int i=start;i<nums.length;i++){
            current.add(nums[i]);
            combination(i,nums,target-nums[i],current,res);
            current.remove(current.size()-1);
            }
    }
}

