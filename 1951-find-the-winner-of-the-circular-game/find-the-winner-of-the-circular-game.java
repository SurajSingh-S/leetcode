class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list= new ArrayList<>();
            for(int i=1;i<=n;i++){
                list.add(i);
        }
        return helper(list,k-1,0);

    }

    public int helper(List<Integer>list,int k,int index){
        if(list.size()==1) return list.get(0);

        index = (index+k)% list.size();
        list.remove(index);
        return helper(list,k,index);
    }

    


}