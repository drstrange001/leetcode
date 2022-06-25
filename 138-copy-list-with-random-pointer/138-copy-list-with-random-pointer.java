/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public void copyNode(Node head){
        Node curr=head;
        while(curr!=null){
            Node frw=curr.next;
            Node node =new Node(curr.val);
            curr.next=node;
            node.next=frw;
            curr=frw;
        }
    }
    
    public void setRandom(Node head){
        Node curr=head;
        while(curr!=null){
            Node random=curr.random;
            if(random!=null)
            curr.next.random=random.next;
            curr=curr.next.next;
        }
    }
    
    public Node deepCopy(Node head){
        Node curr=head;
        Node dummy= new Node(-1);
        Node prev=dummy;
        while(curr!=null){
            prev.next=curr.next;
            
            curr.next=curr.next.next;
            prev=prev.next;
            curr=curr.next;
        }
        return dummy.next;
    }
    
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        copyNode(head);
        setRandom(head);
        return deepCopy(head);
    }
}