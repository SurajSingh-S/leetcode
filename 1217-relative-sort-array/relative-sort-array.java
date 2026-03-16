class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i:arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int k=0;
        int arr[]= new int [arr1.length];

        for(int i:arr2){
            if(map.containsKey(i)){
                int freq= map.get(i);
                

                while(freq >0){
                    arr[k++]=i;
                    freq--;
                }
                map.remove(i);
            }
        }

        List<Integer> remaining= new ArrayList<>();

        for(int i:map.keySet()){
            int freq= map.get(i);

            while(freq>0){
                remaining.add(i);
                freq--;
            }
        }

        Collections.sort(remaining);

        for(int i=0;i<remaining.size();i++){
            arr[k++]= remaining.get(i);
        }
    return arr;

    }
}