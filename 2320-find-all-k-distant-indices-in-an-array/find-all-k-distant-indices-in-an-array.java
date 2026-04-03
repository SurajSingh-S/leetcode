class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res= new ArrayList<>();
        int n=nums.length;
        int [] arr= new int [n];

        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                int start= Math.max(0,i-k);
                int end= Math.min(i+k,n-1);

                for(int j=start;j<=end;j++){
                    arr[j]=1;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                res.add(i);
            }
        }
        
        return res;

    }
}