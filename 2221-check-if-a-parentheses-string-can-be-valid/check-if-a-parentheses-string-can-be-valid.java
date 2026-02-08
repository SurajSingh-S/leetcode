class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) return false;

        int open = 0, close=0;

        for(int i=0;i<n;i++){
            if(locked.charAt(i)=='1'){
                if(s.charAt(i)=='('){
                    open++;
                    close++;
                }
                else{
                    open--;
                    close--;
                }
            }
            else {
                close--;
                open++;
            }

            if(open < 0) return false;
            close=Math.max(0,close);
        }
        return close==0;

    }
}