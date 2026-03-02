class Solution {
    public int getLucky(String s, int k) {
        int sum=0;

        for(char c: s.toCharArray()){
            int val = c-'a'+1;
            while (val > 0) {
                sum += val % 10;
                val /= 10;
            }
        }
        if(k==1) return sum;

        
        while(k>1){
            int sum2=0;
            while(sum>0){
                sum2+= sum%10;
                sum=sum/10;

            }
            k--;
            sum=sum2;
        }
        return sum;
    }
}