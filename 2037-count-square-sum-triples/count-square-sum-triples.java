class Solution {
    public int countTriples(int n) {
        int count=0;
        int [] square= new int [n+1];
        for(int i=1;i<=n;i++){
            square[i]= i*i;
        }


        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int sum= square[i]+square[j];

                int c= (int)Math.sqrt(sum);
                if(c<=n && square[c]==sum) count++;
            }
        }
        return count;
    }
}