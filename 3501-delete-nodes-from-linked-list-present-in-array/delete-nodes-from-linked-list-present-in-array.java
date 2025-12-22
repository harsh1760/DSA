import java.util.HashMap;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

       

        HashSet<Integer>set=new HashSet<>();

        for(int n:nums){
            set.add(n);
        }

            ListNode n=new ListNode();
            ListNode tail=n;
         ListNode temp = head;
        while(temp!=null){
            if(!set.contains(temp.val)){
                tail.next=new ListNode(temp.val);
                tail=tail.next;
            }
            temp=temp.next;
        }

        return n.next;
    }
}
