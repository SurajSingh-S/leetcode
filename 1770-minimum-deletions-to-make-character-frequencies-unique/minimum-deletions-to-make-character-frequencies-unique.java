class Solution {
    public int minDeletions(String s) {
        int [] arr= new int [26];

        for(int i:s.toCharArray()){
            arr[i-'a']++;
        }

        int count=0;

        Set<Integer> set= new HashSet<>();

        for(int i:arr){
            while(i>0 && !set.add(i)){
                i--;
                count++;
            }
        }
        return count;
    }
}