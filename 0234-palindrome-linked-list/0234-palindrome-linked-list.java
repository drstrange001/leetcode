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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw = null;
        
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            
            curr = forw;
        }
        
        return prev;
    }
    
    public ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode midNode = mid(head);
        ListNode nHead = reverse(midNode.next);
        
        midNode.next = null;
        ListNode c1 = head;
        ListNode c2 = nHead;
        boolean res = true;
        
        while(c2 != null){
            if(c1.val != c2.val){
                res = false;
                break;
            }
            
            c1 = c1.next;
            c2 = c2.next;
        }
        
        ListNode midNext = reverse(nHead);
        midNode.next = midNext;
        
        return res;
    }
}