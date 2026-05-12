class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] arr= new int [nums.length];
        Arrays.fill(arr,-1);
        Stack<Integer> stack= new Stack<>();
        Map <Integer,Integer> map= new HashMap<>();
        int n=nums.length;

        for(int i=0;i<2*nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i%n]){
                map.put(stack.pop(),nums[i%n]);
            }
           if(i < n) {
                stack.push(i);
            }
        }
        for(int i = 0; i < n; i++) {

            arr[i] = map.getOrDefault(i, -1);
        }
        return arr;


    }
}