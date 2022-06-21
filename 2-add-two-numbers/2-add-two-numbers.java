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

// Hey, This might not be the best approach
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //check for empty list
        if(l1 == null || l2 == null) return l1 != null ? l1 : l2;
        
        ListNode head = new ListNode(-1);
        ListNode itr = head;
        int carry=0;
        
        while(l1!=null || l2!=null || carry!=0){
            int sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            
            //get value for list
            int digit = sum%10;
           
            //get carry
            carry = sum/10;
            
            //new node
            itr.next = new ListNode(digit);
            
            itr = itr.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return head.next;
    }
}