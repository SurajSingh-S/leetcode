class Solution {
    public int compareVersion(String version1, String version2) {
        int i=0,j=0;

        int n1= version1.length();
        int n2= version2.length();

        while(i<n1 || j<n2){
            int v1=0;
            int v2=0;

            while(i<n1 && version1.charAt(i) != '.'){
                v1= v1*10 + (version1.charAt(i)-'0');
                i++;
            }

            while(j<n2 && version2.charAt(j) != '.'){
                v2= v2*10 + (version2.charAt(j)-'0');
                j++;
            }

            if(v1<v2) return -1;
            if(v1>v2) return 1;

            i++;
            j++;
        }
        return 0;
    }
}