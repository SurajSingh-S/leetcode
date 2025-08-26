class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int diagonal = 0;
        int prev = 0;
        int area = Integer.MIN_VALUE;

        for (int i = 0; i < dimensions.length; i++) {
            diagonal = dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1];
            
            int currarea=dimensions[i][1] * dimensions[i][0];

            if (prev < diagonal) {
                area = currarea;
                prev = diagonal;
            }

            else if (prev == diagonal) {
                area = Math.max(area, currarea);
            }
        }
        return area;
    }
}
