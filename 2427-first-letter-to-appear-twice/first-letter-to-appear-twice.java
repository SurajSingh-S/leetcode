class Solution {
    public char repeatedCharacter(String s) {
        char [] arr= s.toCharArray();
        Map<Character,Integer> map= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            char c= arr[i];

            if(map.containsKey(c)) return c;

            map.put(c,i);
        }
        return ' ';
    }
}