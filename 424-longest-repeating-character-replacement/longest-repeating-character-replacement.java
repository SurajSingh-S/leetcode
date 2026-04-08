class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]= new int [26];

        int j=0;
        int maxlen=0;
        int maxfreq=0;

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxfreq= Math.max(maxfreq,freq[s.charAt(i)-'A' ]);

            if((i-j+1)-maxfreq> k){
                freq[s.charAt(j)- 'A']--;
                j++;
            }
        maxlen=Math.max(maxlen, i-j+1);
        }
    return maxlen;
    }
}