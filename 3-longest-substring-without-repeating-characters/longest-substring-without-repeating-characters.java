class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set= new HashSet<>();
        int j=0;
        int i=0;
        int maxlen=0;

        
            while(i<s.length()){
                if(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
                }
            
            else {
                set.add(s.charAt(i));
                i++;
                maxlen=Math.max(set.size(),maxlen);
                }
            }
        
        return maxlen;
    }
}