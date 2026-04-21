class Solution {
    public int maxDistance(int[] colors) {
        
    return Math.max(back(colors),front(colors));
    }
public int back(int [] colors){
    int start=0;
        int end= colors.length-1;
    while(start <end){
            if(colors[start] != colors[end]){
                return end-start;
            }
            //start++;
            end--;
        }
      return 0;  
}
        

        

public int front(int []colors){
    int s=0;
        int e=colors.length-1;
    while(s<e){
            if(colors[s] != colors[e]){
                return e-s;
            }
            //start++;
            s++;
        }
        return 0;
}
        


     
}