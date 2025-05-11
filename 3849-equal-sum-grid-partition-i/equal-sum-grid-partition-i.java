class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int totalSum = 0;
        // for (int[] row : grid) {
        //     for (int val : row) {
        //         totalSum += val;
        //     }
        // }
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

        
        int[] colSum = new int[n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                colSum[j] += grid[i][j];
            }
        }

        int leftSum = 0;
        for (int j = 0; j < n - 1; j++) {  
            leftSum += colSum[j];
            if (leftSum * 2 == totalSum) {
                return true;
            }
        }

        return false;
    }
}
