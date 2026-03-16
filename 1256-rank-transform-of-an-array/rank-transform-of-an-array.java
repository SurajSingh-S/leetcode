class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set= new HashSet<>();

        for(int i:arr){
            set.add(i);
        }

        List<Integer> list= new ArrayList<>(set);
        Collections.sort(list);
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<list.size();i++){
            map.put(list.get(i),i+1);
        }

        for(int i=0;i<arr.length;i++){
            arr[i]= map.get(arr[i]);
        }
        return arr;
    }
}