class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack("", s, result);
        return result;
    }
    public void backtrack(String output, String s,List<String> result){
        if(s.isEmpty()){
            result.add(output);
            return;
        }

        char c= s.charAt(0);
        String remain= s.substring(1);
        if(Character.isDigit(c)){
            backtrack(output+c,remain,result);

        }
        else{
            backtrack(output+Character.toLowerCase(c),remain,result);
            backtrack(output+Character.toUpperCase(c),remain,result);
        }
    }
}