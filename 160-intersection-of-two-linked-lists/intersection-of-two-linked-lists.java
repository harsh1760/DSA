/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
       HashSet<ListNode>l=new HashSet<>();

       ListNode temp=headA;

       while(temp!=null){

        l.add(temp);
        temp=temp.next;

       }
       ListNode temp1=headB;
       while(temp1!=null){

        if(l.contains(temp1)){
            return temp1;
        }
            temp1=temp1.next;
       }
        return null ;
    }
}