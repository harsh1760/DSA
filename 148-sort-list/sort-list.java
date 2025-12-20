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

    public static ListNode Midfun(ListNode head){

            ListNode temp=head;
            ListNode slow=head;
            ListNode fast=head.next;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
    }

    public static ListNode merge(ListNode l,ListNode r){

        ListNode n=new ListNode();
        ListNode tail=n;

        while(l!=null && r!=null ){

            if(l.val<r.val){
                tail.next=l;
                l=l.next;
            }else{
                 tail.next=r;
                r=r.next;
            }
            tail=tail.next;
        }

        if(l!=null){
            tail.next=l;
        }
        if(r!=null){
            tail.next=r;
        }

        return n.next;
    }
    
    public ListNode sortList(ListNode head) {
      
      if(head==null || head.next==null){
        return head;
      }

      ListNode mid=Midfun(head);
      ListNode Right=mid.next;
      mid.next=null;

      ListNode left=sortList(head);
      ListNode rig=sortList(Right);

      return merge(left,rig);




    }
}