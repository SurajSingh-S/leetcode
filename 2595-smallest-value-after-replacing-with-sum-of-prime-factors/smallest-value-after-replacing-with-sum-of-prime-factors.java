class Solution {
    public int smallestValue(int n) {

        int sum= primefactorsum(n);

        while(n !=sum){
            
            n=sum;
            sum=primefactorsum(n);
        }
        return n;
    }

    public int primefactorsum(int n){
        int sum=0;

        while(n%2 ==0){
            sum+= 2;
            n=n/2;
        }

        for(int i=3;i*i<=n;i+=2){
            while(n%i==0){
                sum+=i;
                n=n/i;
            }
        }

        if(n>1){
            sum+= n;
        }
        return sum;    // If n is still > 1, it's prime
    }
}