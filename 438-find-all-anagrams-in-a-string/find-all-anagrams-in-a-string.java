class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res= new ArrayList<>();
        int sfreq[]= new int [26];
        int pfreq[]= new int [26];
        int n=s.length();
        int k=p.length();

        for(int i=0;i<k;i++){
            pfreq[p.charAt(i)-'a']++;
        }

        for(int i=0;i<n;i++){
            sfreq[s.charAt(i)-'a']++;

            if(i>=k){
                sfreq[s.charAt(i-k)-'a']--;
            }
            if(Arrays.equals(sfreq,pfreq)) res.add(i-k+1);
        }
        return res;
    }
}