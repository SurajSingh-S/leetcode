class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder() ;

        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        return helper(sb.toString());
    }

    public boolean helper(String k){
        int start=0;
        int end= k.length()-1;

        while(start < end){
            if(k.charAt(start) != k.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}