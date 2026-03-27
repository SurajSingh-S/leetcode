class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n= mat[0].length;
        int [][] original= new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                original[i][j]=mat[i][j];
            }
        }

        for(int i=0;i<m;i++){
            
                if(i %2==0){
                    left(mat[i],k);                   
                }
                else{
                right(mat[i],k);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(original[i][j] != mat[i][j]) return false;
            }
        }
        return true;
        
    }

    public void left(int []row,int k){
        int n = row.length;
        k = k % n;

        reverse(row, 0, k - 1);
        reverse(row, k, n - 1);
        reverse(row, 0, n - 1);
    }

    public void right(int []row,int k){
        int n = row.length;
        k = k % n;

        reverse(row, 0, n - 1);
        reverse(row, 0, k - 1);
        reverse(row, k, n - 1);
    }

    public void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}