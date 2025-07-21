// class Solution {
//     public String makeFancyString(String s) {
//         char []  arr= s.toCharArray();
//         int count=0;

//         for(int i=1;i<arr.length-1;i++){
//             if(arr[i]==arr[i-1] && arr[i]==arr[i+1]) arr[i-1] ='*';
//         }
//         StringBuilder sb= new StringBuilder();
//         for(int i=0;i<arr.length;i++){
//             sb.append(arr[i]);
//         }
//         for(int i=sb.length()-1;i>=0;i--){
//             if(sb.charAt(i)=='*'){
//                 sb.deleteCharAt(i);
//             }
//         }
//         return sb.toString();
//     }
// }


class Solution 
{
    public String makeFancyString(String s) 
    {

        StringBuilder result = new StringBuilder();

        result.append(s.charAt(0));

        int count = 1;

        for (int i = 1; i < s.length(); i++) 
        {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
            else{
                count = 1;
            }

            if (count < 3) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}