class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==0 || s.length()==1) return s.length();
        boolean hasodd=false;
        Map<Character,Integer>map= new HashMap<>();

        int count=0;

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i:map.values()){
            if(i%2==0){
                count+=i;
            }
            else{
                count+=i-1;
                hasodd=true;
            }
        }
        if(hasodd){
                count+=1;
            }
        return count;
    }
}