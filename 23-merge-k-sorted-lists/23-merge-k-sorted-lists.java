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
    public ListNode mergeTwoSortedLinkedLists(ListNode l1, ListNode l2){
        if(l1==null || l2==null) return l1!=null? l1:l2;
        ListNode dummy= new ListNode(-1);
        ListNode prev=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                prev.next=l1;
                l1=l1.next;
            }
            else {
                prev.next=l2;
                l2=l2.next;
            }
            prev=prev.next;
        }
        prev.next=l1!=null?l1:l2;
        return dummy.next;
    }
    
    public ListNode mergeKLists(ListNode[] lists, int si, int ei) {
        if(si>ei) return null;
        if(si==ei) return lists[si];
        int mid=(si+ei)/2;
        ListNode l1= mergeKLists(lists,si,mid);
        ListNode l2= mergeKLists(lists,mid+1,ei);
        
        return mergeTwoSortedLinkedLists(l1,l2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        return mergeKLists(lists,0,lists.length-1);
    }
}