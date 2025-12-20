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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode temp = head;
        while (temp != null && temp.next != null) {

            if (temp != null && temp.val == temp.next.val) {

                int dup = temp.val;

                while (temp != null && temp.val == dup) {
                    temp = temp.next;
                }

            } else {
                curr.next = new ListNode(temp.val);
                curr = curr.next;

                temp = temp.next;
            }
        }

        if (temp != null) {
            curr.next = new ListNode(temp.val);
            curr = curr.next;
        }
        return dummy.next;
    }
}