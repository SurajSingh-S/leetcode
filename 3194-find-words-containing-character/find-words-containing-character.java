class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list= new ArrayList<>();

        for(int s=0;s<words.length;s++){
            for(int i=0;i<words[s].length();i++){
                if(words[s].charAt(i)==x){
                    list.add(s);
                    break;
                }
            }
        }
        return list;
    }
}