class Solution {
    public int numTeams(int[] arr) {
        int count=0;
        int n=arr.length;

        for(int k=1;k<n-1;k++){  //middle one
            int leftsmaller=0,leftgreater=0;
            for(int i=0;i<k;i++){ //left one
                if(arr[k]>arr[i]){
                    leftsmaller++;
                }
                else if (arr[i]>arr[k])leftgreater++;
            }

            int rightsmaller=0,rightgreater=0;
            for(int j=k+1;j<n;j++){ //right one
                if(arr[k]>arr[j]){
                    rightsmaller++;
                }
                else if(arr[k]<arr[j]) rightgreater++;
            }
            count+= leftgreater*rightsmaller;
            count+= leftsmaller*rightgreater;
        }
        return count;
        
    }
}