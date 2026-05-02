class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr= new int [2];
        arr[0]=firstelement(nums,target);
        arr[1]=lastelement(nums,target);

        return arr;
    }

    public int firstelement(int[] nums,int target){
        int first=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                first= mid;
                end=mid-1;
            }

            else if(target < nums[mid]){
                end=mid-1;
            }
            else start=mid+1;
        }
        return first;


    }

    public int lastelement(int []nums,int target){
        int last=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid] == target) {
                last = mid;        
                start = mid + 1;   
            }
            else if(target > nums[mid]){
                start=mid+1;
            }
            else end=mid-1;

        }
        return last;
    }


}