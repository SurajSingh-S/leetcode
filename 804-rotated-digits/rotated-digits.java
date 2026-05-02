class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(isgood(i)) count++;
        }
        return count;
    }

    public boolean isgood(int n){
        boolean good=false;

        while(n>0){
            int digit =n%10;

            if(digit==4 || digit==7||digit==3){
                return false;
            }
            if (digit == 2 || digit == 5 || digit == 6 || digit == 9){
                good=true;
            }
            n=n/10;
        }
        return good;
    }
}