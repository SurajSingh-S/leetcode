/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode fast=head, slow=head;
        //mid point
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode first=head;

        ListNode second= reverseList(slow.next);

        slow.next=null;//break point

        while(second != null){
            ListNode temp1=first.next;
            ListNode temp2=second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode tempnext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempnext;
        }
        return prev;
    }
}