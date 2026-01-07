class Solution {
    public int repeatedNTimes(int[] nums) {
        int n= nums.length;
        int [] arr= new int [n*2];

        for(int i=0;i<arr.length;i++){
            arr[i]=nums[i%n];
        }
        int max=0;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }

        int [] freq= new int [max+1];

        for(int i:arr){
            freq[i]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]==n){
                return i;
            }
        }
        return -1;
    }
}