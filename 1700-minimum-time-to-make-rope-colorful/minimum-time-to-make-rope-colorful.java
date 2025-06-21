class Solution {
    public int minCost(String s, int[] time) {
        
        int count=0;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count += Math.min(time[i],time[i-1]);
                time[i] = Math.max(time[i], time[i - 1]);
            }
        }
        return  count;
    }
}