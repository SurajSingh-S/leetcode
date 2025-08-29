class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n= grid.length;

        for(int j=1;j<n;j++) {
            sortDiagonal(grid,0,j,true);
        }

        for(int i=0;i<n;i++){
            sortDiagonal(grid,i,0,false);
        }
        return grid;
    }

    public void sortDiagonal(int [][]grid,int r,int c,boolean asc){
        int i=r;
        int j=c;
        int n=grid.length;

        List<Integer> res= new ArrayList<>();

        while(i<n && j<n){
            res.add(grid[i++][j++]);
        }

        if(asc) Collections.sort(res);

        else res.sort(Collections.reverseOrder());

        i=r;
        j=c;
        int k=0;

        while(i<n && j<n){
            grid[i++][j++]=res.get(k++);
        }

    }


}