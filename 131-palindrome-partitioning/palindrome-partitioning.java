class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result= new ArrayList<>();

        backtrack(result,new ArrayList<>(), s, 0);
        return result;
        
    }

    public void backtrack(List<List<String>>result,List<String>current,String s,int start){
        if(start==s.length()){
            result.add(new ArrayList<>(current));
        }

        for(int end=start+1;end<=s.length();end++){
            String curr= s.substring(start,end);
            if(isPalindrome(curr)){
                current.add(curr);
                backtrack(result,current,s,end);
                current.remove(current.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}