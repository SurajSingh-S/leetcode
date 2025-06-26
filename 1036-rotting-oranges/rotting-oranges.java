class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int minute = 0;
        int freshOranges = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        // Add all initially rotten oranges to the queue and count fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        // If there are no fresh oranges, return 0
        if (freshOranges == 0) return 0;

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        // BFS to rot adjacent fresh oranges
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int r = curr[0], c = curr[1];

                for (int[] d : directions) {
                    int nr = r + d[0];
                    int nc = c + d[1];

                    // Check boundaries and if the adjacent cell is a fresh orange
                    if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;   // mark as rotten
                        freshOranges--;
                        queue.offer(new int[]{nr, nc});
                        rotted = true;
                    }
                }
            }

            // Increment minutes only if some oranges rotted in this cycle
            if (rotted) {
                minute++;
            }
        }

        // Return -1 if there are still fresh oranges, otherwise return minutes
        return freshOranges == 0 ? minute : -1;
    }
}
