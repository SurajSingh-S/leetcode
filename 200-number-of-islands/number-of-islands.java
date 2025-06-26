class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int rows = grid.length, cols = grid[0].length;
        int count = 0;

        int[][] directions = { {-1,0}, {1,0}, {0,-1}, {0,1} };

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c]=='1'){
                    count++;
                    bfs(grid,r,c,directions);
                }
            }
        }
        return count;
    }

    public static void bfs(char[][] grid,int row,int col,int [][] directions){
        int rows=grid.length;
        int cols=grid[0].length;
        Queue<int []> queue= new LinkedList<>();
        queue.offer(new int []{row,col});
        grid[row][col]='0';

        while(!queue.isEmpty()){
            int [] curr=queue.poll();
            int r= curr[0],c=curr[1];

            for(int d []:directions){
                int nr=r+ d[0] , nc= c+d[1];
                if(nr>=0 && nr <rows && nc>=0 && nc<cols && grid[nr][nc]=='1'){
                    queue.offer(new int[]{nr,nc});
                    grid[nr][nc]='0';
                }
            }
        }

    }
}