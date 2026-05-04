class Solution {
    public boolean findRotation(int[][] matrix,int [][] target) {
        for(int i=0;i<4;i++){
            if(isEqual(matrix,target)){
                return true;
            }
            rotate(matrix,target);
        }
         return false; 
    } 

    public void rotate(int [][] matrix,int [][] target){   
        
        int n= matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            int left=0;
            int right=matrix[i].length-1;

            while(left <right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
    }
    
    public boolean isEqual(int [][]matrix,int [][]target){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j] != target[i][j]){
                        return false;
                    }
                }
            }
            return true;
    }
}