import java.util.*;
class Solution {
    public int minDeletion(String s, int k) {
        //char [] arr= s.toCharArray();
        
        Map<Character,Integer> map= new HashMap<>();
        PriorityQueue<Character>pq= new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(char i:map.keySet()){
            pq.add(i);
        }
        
        int nums[]= new int[map.size()];
        
        while(! pq.isEmpty()){
            for(int i=0;i<map.size();i++){
                char c= pq.poll();
                nums[i]=map.get(c);
            }
        }
        
        int sl=0;
        for(int i=nums.length-1;i>=k;i--){
            sl+=nums[i];
        }
        return sl;
        
    }
}