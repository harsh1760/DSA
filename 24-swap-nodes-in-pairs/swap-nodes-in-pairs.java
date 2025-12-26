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
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        int sz = 0;
        while (temp != null) {
            sz++;
            temp = temp.next;
        }
        if (sz == 1) {
            return head;
        }
        int[] array = new int[sz];
        int k=0;
         ListNode temp1 = head;
        while (temp1 != null) {
            array[k++]=temp1.val;
            temp1 = temp1.next;
        }
        for (int i = 0; i < array.length - 1; i += 2) {
            int key = array[i];
            array[i] = array[i + 1];
            array[i + 1] = key;
        }

        ListNode n = new ListNode();
        ListNode tail = n;
        for (int i = 0; i < array.length; i++) {
            tail.next = new ListNode(array[i]);
            tail = tail.next;
        }
        return n.next;
    }
}