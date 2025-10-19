class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res= new ArrayList<>();
        String prev = "";

        for(int i=0;i<words.length;i++){
            char[] w= words[i].toCharArray();
            Arrays.sort(w);
            String sorted= new String(w);

            if(!prev.equals(sorted)){
                res.add(words[i]);
                prev= sorted;
            }
        }
        return res;
    }
}