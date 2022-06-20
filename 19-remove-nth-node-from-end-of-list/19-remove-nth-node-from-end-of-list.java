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
        ListNode p= new ListNode();
        p.next=head;
        ListNode fast= p;
        ListNode slow= p;
        
        if(head.next==null){
            head=null;
            return head;
        }
        if(head.next.next==null){
            if(n==2){
            head=head.next;
            return head;
            }
            else if(n==1){
                head.next=null;
                return head;
            }
        }
        
        for(int i=1;i<=n;i++)
            fast=fast.next;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return p.next;
    }
}