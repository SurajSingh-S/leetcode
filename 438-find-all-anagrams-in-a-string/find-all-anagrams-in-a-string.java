class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res= new ArrayList<>();
        int [] freqs= new int [26];
        int [] freqp= new int [26];

        int m=p.length();
        int n=s.length();

        for(int i=0;i<m;i++){
            freqp[p.charAt(i)-'a']++;
        }

        for(int i=0;i<n;i++){
            freqs[s.charAt(i)-'a']++;

            if(i>=m){
                freqs[s.charAt(i-m)-'a']--;
            }

            if(Arrays.equals(freqs,freqp)) {
                res.add(i-m+1);
            }
        }
        return res;
    }
}