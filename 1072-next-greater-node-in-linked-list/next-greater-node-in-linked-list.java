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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer>ln=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ln.add(temp.val);
            temp=temp.next;
        }
        int n=ln.size();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ln.get(i)<ln.get(j)){
                nums[i]=ln.get(j);
                break;
                }
            }
        }
        return nums;
    }
}