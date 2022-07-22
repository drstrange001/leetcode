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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null) return head;
        
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        
        ListNode prevIt= null;
        ListNode currIt=dummy;
        
        for(int i=0; i<left; i++){
            prevIt=currIt;
            currIt=currIt.next;
        }
        
        ListNode prevR=prevIt;
        ListNode currR=currIt;
        
        for(int i=left;i<=right;i++){
            ListNode forw= currR.next;
            currR.next=prevR;
            prevR=currR;
            currR=forw;
        }
        
        prevIt.next=prevR;
        currIt.next=currR;
        
        return dummy.next;
    }
}