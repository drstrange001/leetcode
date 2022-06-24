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
    
    static ListNode th=null;
    static ListNode tt=null;
    
    public static void addFirst(ListNode head){
        if(th==null){
            th=head;
            tt=head;
        } else {
            head.next=th;
            th=head;
        }
    }
    
    public static int length(ListNode head){
        ListNode curr=head;
        int length=0;
            while(curr!=null){
                curr=curr.next;
                length++;
            }
        return length;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        
        ListNode curr=head;
        ListNode oh=null;
        ListNode ot=null;
        int length=length(head);
        
        while(length >= k){
            int tempK=k;
            while(tempK-- >0){
                ListNode frw=curr.next;
                curr.next=null;
                addFirst(curr);
                curr=frw;
            }
            if(oh==null){
                oh=th;
                ot=tt;
            } else{
                ot.next=th;
                ot=tt;
            }
            tt=null;
            th=null;
            length-=k;
        }
        ot.next=curr;
        return oh;
    }
}