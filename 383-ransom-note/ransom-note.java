class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // int count=0;
        char[] ransomNotearr=ransomNote.toCharArray();
        char[] magazinearr=magazine.toCharArray();
       
        // for(int i=0;i<ransomNotearr.length;i++){
        //     for(int j=0;j<magazinearr.length;j++){
        //         if(ransomNotearr[i]==magazinearr[j]) {
        //         count++;
        //         magazinearr[j]='*';
        //         break;
        //         }
        //     }
        // }
        // return(count==ransomNote.length()) ? true:false;

        Map<Character,Integer>map= new HashMap<>();

        for(char c:magazinearr){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : ransomNotearr){
            if( ! map.containsKey(c) || map.get(c)==0) return false;

            else 
            map.put(c,map.get(c)-1);
        }   
            return true;
    }
}