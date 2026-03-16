class Solution {
    public int[] frequencySort(int[] nums) {
        int n= nums.length;

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        Integer [] arr= new Integer[n];

        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }

        Arrays.sort(arr,(a,b)->{
            int fa=map.get(a);
            int fb=map.get(b);

            if(fa != fb) return fa-fb;
            else return b-a;
        });

        int[] res= new int [n];

        for(int i=0;i<n;i++){
            res[i]=arr[i];
        }
        return res;
    }
}