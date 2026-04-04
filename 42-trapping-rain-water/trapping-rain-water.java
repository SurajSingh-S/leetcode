class Solution {
    public int trap(int[] height) {
        int [] maxl= new int [height.length];
        int [] maxr= new int [height.length];


        int max=0;
        for(int i=0;i<height.length;i++){
            max= Math.max(height[i],max);
            maxl[i]= max;
        }
        
        max=0;
        for(int i=height.length-1;i>=0;i--){
            max= Math.max(height[i],max);
            maxr[i]= max;
        }
        
        int water_level=0;

        for(int i=0;i<height.length;i++){
            int m=Math.min(maxl[i],maxr[i]);
            water_level+= m-height[i];
        }
        return water_level;
    }
}