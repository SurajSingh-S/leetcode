class Solution {
    public boolean validMountainArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        int index=0;

        int n = arr.length;
        if(n < 3) return false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }

        if(index==0 ||index==arr.length-1) return false;
        for(int i = 0; i < index; i++){
            if(arr[i] >= arr[i+1]) return false;
        }

        for(int i = index; i < n-1; i++){
            if(arr[i] <= arr[i+1]) return false;
        }
        return true;

    }
}