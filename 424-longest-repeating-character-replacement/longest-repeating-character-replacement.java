class Solution {
    public int characterReplacement(String s, int k) {
        int [] arr= new int [26];
        int maxfreq=0;
        int maxlen=0;
        int left=0;

        for(int right=0;right< s.length();right++){
            arr[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq,arr[s.charAt(right)-'A']);

            if((right-left+1)-maxfreq>k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}