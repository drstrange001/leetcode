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
    
    public ListNode findMid(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!= null && fast.next.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode futr=null;
        while(curr!=null){
            futr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=futr;
        }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        
        ListNode mid= findMid(head);
        ListNode newHead=mid.next;
        newHead=reverse(newHead);
        mid.next=null;
        ListNode c1=head;
        ListNode c2=newHead;
        boolean res=true;
        while(c2!=null){
            if(c1.val != c2.val){
                res=false;
                break;
            }
            c1=c1.next;
            c2=c2.next;
        }
        
        newHead=reverse(newHead);
        mid.next=newHead;
        return res;
    }
}