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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode current=head;
        ListNode tail= head;
        int length=1;

        while(tail.next != null){
            tail=tail.next;
            length++;
        }

        k=k%length;
        if(k==0) return head;

        for(int i=0;i<length-k-1;i++){
            current=current.next;
        }

        ListNode newhead= current.next;
        current.next=null;
        tail.next=head;
        return newhead;

    }
}