class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int k= n/4;

        Map<Integer,Integer>map= new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int i:map.keySet()){
            if(map.get(i)>k){
                return i;
            }
        }
        return -1;
    }
}