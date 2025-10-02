class Solution {
    public int unhappyFriends(int n, int[][] pref, int[][] pairs) {
        int[] partner = new int[n];
        for (int[] p : pairs) {
            partner[p[0]] = p[1];
            partner[p[1]] = p[0];
        }

        int[][] rank = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                rank[i][pref[i][j]] = j;
            }
        }

        int count = 0;
        for (int x = 0; x < n; x++) {
            int y = partner[x];
            for (int u = 0; u < n; u++) {
                if (u == x || u == y) continue;
                int v = partner[u];
                if (rank[x][u] < rank[x][y] && rank[u][x] < rank[u][v]) {
                    count++;
                    break; 
                }
            }
        }

        return count;
    }
}
