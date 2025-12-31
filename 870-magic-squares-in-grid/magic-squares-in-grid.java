class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int count=0;

        for(int i=0;i<=m-3;i++){
            for(int j=0;j<=n-3;j++){

                int [][] arr= new int [3][3];
                
                for(int r=0;r<3;r++){
                    for(int c=0;c<3;c++){
                        arr[r][c]= grid[i+r][j+c];
                    }
                }

                if(!isfreqone(arr) || !checksum(arr)) continue;
                count++;

            }
        }
        return count;

    }

    public boolean isfreqone(int [][] arr){
        HashSet<Integer> set= new HashSet<>();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(!set.add(arr[i][j]) || arr[i][j]>9 || arr[i][j]<0) return false;
            }
        }
        return true;
    }

    public boolean checksum(int [][] arr){
        
                int r1 = arr[0][0] + arr[0][1] + arr[0][2];
                int r2 = arr[1][0] + arr[1][1] + arr[1][2];
                int r3 = arr[2][0] + arr[2][1] + arr[2][2];

                int c1 = arr[0][0] + arr[1][0] + arr[2][0];
                int c2 = arr[0][1] + arr[1][1] + arr[2][1];
                int c3 = arr[0][2] + arr[1][2] + arr[2][2];

                int d1 = arr[0][0] + arr[1][1] + arr[2][2];
                int d2 = arr[0][2] + arr[1][1] + arr[2][0];
            
        return (r1 == 15 && r2 == 15 && r3 == 15 &&
                c1 == 15 && c2 == 15 && c3 == 15 &&
                d1 == 15 && d2 == 15);
    }
}