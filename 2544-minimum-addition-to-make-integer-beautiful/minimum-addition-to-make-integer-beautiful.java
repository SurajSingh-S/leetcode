class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        if(n==target) return 0;
        if(helper(n,target)) return 0;

        long original=n;

        long base=1;
        long add=0;

        while(!helper(n,target)){
            long digit= (n/base)%10;

            long increment= (10-digit)%10;

            if(increment>0){
                n = n+ increment*base;
                add = add+ increment*base; 
            }
            base = base*10;
        }
    return add;
    }

    public boolean helper(long n,int target){
        long sum=0;
        while(n>0){
            long r= n%10;
            sum+=r;
            n=n/10;
        }

        return sum<=target;
    }
}