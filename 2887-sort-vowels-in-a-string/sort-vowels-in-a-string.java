class Solution {
    public String sortVowels(String s) {
        String vowels="aeiouAEIOU";
        String current= new String(s);
        String news= new String();

        char[] arr= current.toCharArray();

        for(int i=0;i<current.length();i++){
            if(vowels.indexOf(arr[i]) != -1)
            news= news+arr[i];
        }

        char[] newarr= news.toCharArray();
        Arrays.sort(newarr);
        int j=0;
        for(int i=0;i<arr.length;i++){
            char c= arr[i];

            if(vowels.indexOf(c) != -1){
                arr[i]=newarr[j];
                j++;
            }
        }
        return new String(arr);
    }
}