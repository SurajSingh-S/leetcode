class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Calculate total sum of all elements
        int totalSum = 0;
        for (int[] row : grid) {
            for (int val : row) {
                totalSum += val;
            }
        }

        // Try horizontal cuts
        int topSum = 0;
        for (int i = 0; i < m - 1; i++) {  // cut after row i
            for (int j = 0; j < n; j++) {
                topSum += grid[i][j];
            }
            if (topSum * 2 == totalSum) {
                return true;
            }
        }

        // Try vertical cuts
        int[] colSum = new int[n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                colSum[j] += grid[i][j];
            }
        }

        int leftSum = 0;
        for (int j = 0; j < n - 1; j++) {  // cut after column j
            leftSum += colSum[j];
            if (leftSum * 2 == totalSum) {
                return true;
            }
        }

        return false;
    }
}
