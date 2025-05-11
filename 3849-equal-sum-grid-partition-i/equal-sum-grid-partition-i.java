class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int totalSum = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                totalSum+=grid[i][j];
            }
        }

        int topSum = 0;
        for (int i = 0; i < m - 1; i++) {  
            for (int j = 0; j < n; j++) {
                topSum += grid[i][j];
            }
            if (topSum * 2 == totalSum) {
                return true;
            }
        }

        
       int leftSum = 0;
for (int j = 0; j < n - 1; j++) {  // try cut after column j
    for (int i = 0; i < m; i++) {
        leftSum += grid[i][j];    // accumulate column values
    }
    if (leftSum * 2 == totalSum) {
        return true;
    }
}


        return false;
    }
}
