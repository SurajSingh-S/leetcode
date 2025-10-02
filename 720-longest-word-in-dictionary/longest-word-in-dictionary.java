class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String res="";
        Set<String> set= new HashSet<>();

        int n=words.length;
        
        for(String w:words){
            if(w.length()==1 || set.contains(w.substring(0,w.length()-1))){
                set.add(w);

                if(w.length()>res.length()){
                    res=w;
                }
            }
        }
        return res;
    }
}