public class Solution {
    public int MaxFreqSum(string s) {
        int [] freq= new int [26];

        string v = "aeiou";

        foreach(char i in s){
            freq[i-'a']++;
        }

        int maxv=0;
        int maxc=0;

        for(int i=0;i<26;i++){
            char ch= (char)('a'+i);

            if(v.Contains(ch)) {
                maxv=Math.Max(maxv,freq[i]);
            }
            else{
                maxc=Math.Max(maxc,freq[i]);
            }

        }
        return maxc+maxv;
    }
}