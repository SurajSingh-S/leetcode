class Solution {
    public String processStr(String s) {
        String str="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                str= star(str);
            }

            else if(s.charAt(i)=='#'){
                str=hash(str);
            }

            else if(s.charAt(i)=='%'){
                str=percent(str);
            }
            else str+= s.charAt(i);
        }
        return str;
    }

    public String star(String str){
        if (str != null && str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public String hash(String str){
        return str+str;
    }

    public String percent(String str){
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return rev;
    }
}