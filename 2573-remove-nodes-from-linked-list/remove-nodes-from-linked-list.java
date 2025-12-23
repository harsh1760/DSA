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
    public ListNode removeNodes(ListNode head) {
        
        head = reverse(head);

        ListNode curr = head;
        int max = Integer.MIN_VALUE;

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

       
        while (curr != null) {
            if (curr.val >= max) {
                max = curr.val;
                tail.next = new ListNode(curr.val);
                tail = tail.next;
            }
            curr = curr.next;
        }

        
        return reverse(dummy.next);
    }

       private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
}