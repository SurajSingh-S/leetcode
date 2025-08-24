class Solution {
    public int minimumArea(int[][] grid) {
        
        int m=grid.length;
        int n= grid[0].length;

        int rf = m;      
        int rl = -1;     
        int cf = n;    
        int cl = -1;  


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    cf=Math.min(j,cf);
                    cl=Math.max(j,cl);

                    rf=Math.min(i,rf);
                    rl=Math.max(i,rl);
                }
            }
        }

        int len= cl-cf+1;
        int bred= rl-rf+1;

        int area= len*bred;

        return area;
    }
}