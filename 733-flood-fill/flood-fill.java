class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) {
        int oldcolor=image[sr][sc];
        if(oldcolor== newcolor) return image;

        dfs(image,sr,sc,oldcolor,newcolor);
        return image;
    }

    public void dfs(int [][] image,int r,int c,int oldcolor,int newcolor){
        int rows= image.length;
        int cols= image[0].length;
        

        if(r < 0 || r >= rows || c < 0 || c >= cols || image[r][c] != oldcolor) return ;

        image[r][c]=newcolor;
        
        dfs(image,r-1,c,oldcolor,newcolor);
        dfs(image,r+1,c,oldcolor,newcolor);
        dfs(image,r,c+1,oldcolor,newcolor);
        dfs(image,r,c-1,oldcolor,newcolor);
    }

}