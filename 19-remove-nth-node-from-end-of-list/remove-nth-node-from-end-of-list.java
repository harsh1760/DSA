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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null){
            return head;
        }

        ListNode temp=head;
        int sz=0;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }

        if(sz==n){
            return head.next ;
        }

       int pos=sz-n;
        ListNode temp1=head;
       for(int i=1;i<pos;i++){
            temp1=temp1.next;
       }

    temp1.next = temp1.next.next;

        return head;
    }
}