class Solution {
    public int totalMoney(int n) {
        int sum=0;

        int re= n/7;

        for(int i=0;i<re;i++){
            for(int j=i+1;j<=i+7;j++){
                sum+= j;
            }
        }
        int res= sum;

        int left= n-re*7;

        for(int i=re+1;i<=left+re;i++){
            res+= i;
        }

    return res;


    }
}