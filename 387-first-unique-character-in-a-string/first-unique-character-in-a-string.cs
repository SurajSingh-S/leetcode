public class Solution {
    public int FirstUniqChar(string s) {
        int [] arr= new int [26];

        foreach(char c in s){
            arr[c-'a']++;
        }

        for(int i=0;i<s.Length;i++){
            if(arr[s[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}