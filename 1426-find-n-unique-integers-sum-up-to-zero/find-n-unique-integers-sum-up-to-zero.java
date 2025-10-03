class Solution {
    public int[] sumZero(int n) {
        int [] nums= new int [n];

        int start=0;
        int end= nums.length-1;
        int mid= start+(end-start)/2;
        if(n%2 != 0) nums[mid]=0;

        while(  start < end ){
            nums[start]= 0-n;
            nums[end]=n;
            n--;
            start++;
            end--;
        }
//         if (start + 1 < n) {
//     nums[start+1] = nums[start] + 1;
// }
// if (end < n) {
//     nums[end] = nums[start] + 1;
// }
// if (start + 2 < n) {
//     nums[start+2] = nums[end] - nums[start+1];
// }


        return nums;
    }
}


