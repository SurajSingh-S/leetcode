class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int arr[][] = new int [plantTime.length][2];
        for(int i=0;i<plantTime.length;i++){
            arr[i][0]=plantTime[i];
            arr[i][1]=growTime[i];
        }
        
        Arrays.sort(arr, (a, b) -> b[1] - a[1]);

        int currentday=0;
        int bloomday=0;

        for(int []a:arr){
            currentday +=a[0];
            bloomday=Math.max(currentday+a[1],bloomday);
        }
        return bloomday;
        
    }
}