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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode temp=head;
        int sz=1;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }
        int[] array=new int[sz];

        ListNode curr=head;
        int i=1;
        while(curr!=null){
            array[i++]=curr.val;
            curr=curr.next;
        }

        int data=array[k];
        array[k]=array[array.length-k];
        array[array.length-k]=data;
        ListNode n=new ListNode();
        ListNode tail=n;
        for(int m=1;m<array.length;m++){
            tail.next=new ListNode(array[m]);
            tail=tail.next;
        }     

        return n.next; 
    }
}