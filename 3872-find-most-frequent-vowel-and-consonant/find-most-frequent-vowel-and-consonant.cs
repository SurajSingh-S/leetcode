public class Solution {
    public int MaxFreqSum(string s) {
        int [] freq= new int [26];
        int maxv=0;
        int maxc=0;
        string v="aeiou";

        foreach(int i in s){
            freq[i-'a']++;
        }

        for(int i=0;i<26;i++){
            char ch= (char)(i+'a');
            if(v.Contains(ch)){
                maxv=Math.Max(maxv,freq[i]);
            }
            else {
                maxc=Math.Max(maxc,freq[i]);
            }
        }
        return maxc+maxv;
    }
}