class Solution {
    public int numberOfPairs(int[][] points) {
        
        int []p= new int[2];
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];  
            }
            return a[0] - b[0];     
        });

        int n= points.length;
        int count=0;

        for(int i=0;i<n;i++){
            int maxy=-1;

            for(int j=i+1;j<n;j++){
                if(points[j][1]<=points[i][1] && points[j][1]>maxy){
                    count++;
                    maxy=points[j][1];
                }
            }
        }
        return count;
    }
}