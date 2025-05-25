class Solution {
        private Map<String, Boolean> memo = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
       // Map<String,Integer> memo= new HashMap<>();
        int n= s1.length();
        if(s1.equals(s2)) return true;
        if(s1.length() != s2.length()) return false;

        String key= s1 +'#'+s2;

        if(memo.containsKey(key)) {
            return memo.get(key);
        }

        if(!havesamechar(s1,s2)){
            memo.put(key,false);
            return false;
        }

        for(int i=1;i<n;i++){
            //check without swap
                if(isScramble(s1.substring(0,i), s2.substring(0,i)) && isScramble(s1.substring(i),s2.substring(i)) ){
                    memo.put(key,true);
                    return true;
                }

            //check with swap

            if(isScramble(s1.substring(0,i),s2.substring(n-i)) && isScramble(s1.substring(i),s2.substring(0,n-i))){
                   memo.put(key,true);
                   return true;
            }
        }
        memo.put(key,false);
        return false;


    }

    public boolean havesamechar (String s1, String s2){
        int [] arr= new int [26];
        for(char i:s1.toCharArray()){
            arr[i-'a']++;
        }
        for(char i:s1.toCharArray()){
            arr[i-'a']--;
        }

        for(int i:arr){
            if(i != 0) return false;
        }
        return true;
    }
}