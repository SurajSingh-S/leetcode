public class Solution {
    public int[] Intersection(int[] nums1, int[] nums2) {
        HashSet<int> set1 = new HashSet<int>(nums1);
        HashSet<int> set2= new HashSet<int>();

        foreach(int i in nums2){
            if(set1.Contains(i)){
                set2.Add(i);
            }

        }

        int [] arr= new int [set2.Count];
        int j=0;
        foreach(int i in set2){
            arr[j++]=i;
        }
        return arr;

    }
}