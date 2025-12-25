/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }

        if(!cycle){
            return null;
        }

        ListNode slow1=head;
        ListNode prev=null;
        while(slow1!=fast){
            slow1=slow1.next;
            prev=fast;
            fast=fast.next;
        }
    
        return slow1;
    }
}