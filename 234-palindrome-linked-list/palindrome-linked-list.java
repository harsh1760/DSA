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
    public boolean isPalindrome(ListNode head) {
        
        ArrayList<Integer>ln=new ArrayList<>();

        ListNode temp=head;
        while(temp!=null){
            ln.add(temp.val);
            temp=temp.next;
        }

        int i=0;
        int j=ln.size()-1;

        while(i<j){

            if(ln.get(i)!=ln.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}