class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack= new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int [] arr= new int [nums1.length];
        //Arrays.fill(arr,-1);

        for(int i:nums2){
            while(!stack.isEmpty() && stack.peek()<i){
                map.put(stack.pop(),i);
            }
            stack.push(i);
        }

        int k=0;
        for(int i=0;i<nums1.length;i++){
            arr[k++]=map.getOrDefault(nums1[i],-1);
        }
        return arr;

    }
}