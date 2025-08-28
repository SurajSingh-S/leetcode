import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        // Top-right diagonals: start on first row, EXCLUDING main diagonal
        for (int j = 1; j < n; ++j) {
            sortDiagonal(grid, 0, j, true);   // ascending
        }

        // Bottom-left diagonals: start on first column, INCLUDING main diagonal
        for (int i = 0; i < n; ++i) {
            sortDiagonal(grid, i, 0, false);  // descending
        }

        return grid;
    }

    private void sortDiagonal(int[][] g, int r, int c, boolean asc) {
        int n = g.length;
        List<Integer> vals = new ArrayList<>();
        int i = r, j = c;

        // collect
        while (i < n && j < n) {
            vals.add(g[i++][j++]);
        }

        // sort
        if (asc) Collections.sort(vals);
        else vals.sort(Collections.reverseOrder());

        // write back
        i = r; j = c;
        int k = 0;
        while (i < n && j < n) {
            g[i++][j++] = vals.get(k++);
        }
    }
}
