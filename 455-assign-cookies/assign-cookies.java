class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;

        Arrays.sort(s);
        Arrays.sort(g);

        int j=0;

        for(int i=0;i<g.length;i++){
            for(;j<s.length;j++){
                if(g[i]<=s[j]){
                    count++;
                    j++;
                    break;
                    
                }
            }
        }
        return count;
    }
}