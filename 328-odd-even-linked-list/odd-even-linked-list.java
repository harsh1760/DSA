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
    public ListNode oddEvenList(ListNode head) {

        if(head==null){
            return head;
        }

        ListNode temp=head;
        ListNode n=new ListNode();
        ListNode tail=n;

        int i=1;
        while(temp!=null){

            if(i%2!=0){
                tail.next=new ListNode(temp.val);
                tail=tail.next;
                
            }
            i++;
            temp=temp.next;
        }
        ListNode temp1=head;
        int k=1;
        while(temp1!=null){

            if(k%2==0){
                tail.next=new ListNode(temp1.val);
                tail=tail.next;
                
            }
            k++;
            temp1=temp1.next;
        }

        return n.next;
    }
}
