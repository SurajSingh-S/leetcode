class Solution {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        int deletions=0;

        boolean [] sorted= new boolean [rows-1];

        for(int j=0;j< cols;j++){

            boolean needdelete= false;

            for(int i=0;i<rows-1;i++){
                if( ! sorted[i] && strs[i].charAt(j) > strs[i+1].charAt(j) ){
                    needdelete=true;
                    break;
                }
            }
            if(needdelete) {
                deletions++;
            }
            else{
                for(int i=0;i< rows-1;i++){
                    if(strs[i].charAt(j) < strs[i+1].charAt(j))
                    sorted[i]=true;
                }
            }
        }
        
        return deletions;
    }

    
}