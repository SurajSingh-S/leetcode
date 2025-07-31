class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count=0;
        char[] ransomNotearr=ransomNote.toCharArray();
        char[] magazinearr=magazine.toCharArray();
        // Arrays.sort(ransomNotearr);
        // Arrays.sort(magazinearr);
        for(int i=0;i<ransomNotearr.length;i++){
            for(int j=0;j<magazinearr.length;j++){
                if(ransomNotearr[i]==magazinearr[j]) {
                count++;
                magazinearr[j]='*';
                break;
                }
            }
        }
         return(count==ransomNote.length()) ? true:false;

        
    }
}