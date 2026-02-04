class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String res="";

        String first= strs[0];
        String second= strs[strs.length-1];

        for(int i=0;i<first.length();i++){
            if(first.charAt(i) !=second.charAt(i)){
                return res;
            }
            res+= first.charAt(i);
        }
        return res;
    }
}