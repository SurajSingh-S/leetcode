class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int start=1;
        int end=0;

        for(int i:nums){
            end= Math.max(end,i);
        }

        while(start < end){
            int mid= start+(end-start)/2;

            if(candivide(nums,mid,maxOperations)){
                end=mid;
            } 
            else{
                start=mid+1;
            }
        }
        return start;

    }

    public boolean candivide(int [] nums,int maxballs,int maxoperations){
        int operation=0;
        for(int i:nums){
            operation += (i-1)/maxballs;
            if(operation>maxoperations) return false;
        }
        return true;
    }
}