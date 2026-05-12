class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack= new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int [] arr= new int [nums1.length];
        Arrays.fill(arr,-1);

        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }

        for(int i = 0; i < nums1.length; i++) {

            arr[i] = map.getOrDefault(nums1[i], -1);
        }
        return arr;

    }
}