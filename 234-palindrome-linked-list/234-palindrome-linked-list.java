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

// Hey, This might not be best approach, but easy to understand!
// Logic- Find the mid and then reverse the LinkedList from the mid
class Solution {
    
    //find mid of the linkedList
    public ListNode findMid(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!= null && fast.next.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    //reverse the linkedList
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
        
        // check for empty or if only one element present in the linkedList
        if(head==null || head.next==null) return true;
        
        //find the middle
        ListNode mid= findMid(head);
        
        ListNode newHead=mid.next;
        
        //to reverse from the middle
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
        
        //to return the original linkedList
        newHead=reverse(newHead);
        mid.next=newHead;
        return res;
    }
}