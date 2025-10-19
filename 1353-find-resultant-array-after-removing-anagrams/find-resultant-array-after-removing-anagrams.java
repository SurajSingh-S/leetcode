class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        List<String> res = new ArrayList<>();
        String prevSorted="";
        Set<String> set= new HashSet<>();

        for(int i=0;i<words.length;i++){
            char [] w= words[i].toCharArray();
            Arrays.sort(w);
            String sorted= new String(w);

            if (!sorted.equals(prevSorted)) {
                res.add(words[i]);    
                prevSorted = sorted;  
            }
        }


        return res;
        
    }
}