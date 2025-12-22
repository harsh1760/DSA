/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 * }
 */
class Solution {

    public ListNode modifiedList(int[] nums, ListNode head) {

       
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        
        ListNode temp = head;
        while (temp != null) {
            if (!set.contains(temp.val)) {
                tail.next = new ListNode(temp.val);
                tail = tail.next;
            }
            temp = temp.next;
        }

        return dummy.next;
    }
}
