class ListNode{
    int val;
    ListNode next;
}

class MyLinkedList {

    ListNode head, tail;
    int size = 0;
    
    public int get(int index) {
        if(index < 0 || index >= size) return -1;

        return getNode(index).val;
    }
    
    public void addAtHead(int val) {
        ListNode node = new ListNode();
        node.val=val;
        size++;
        if(head == null){
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }
    
    public void addAtTail(int val) {
        ListNode node = new ListNode();
        node.val = val;
        size++;
        if(head == null){
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        
        if(index == 0) {
            addAtHead(val);
            return;
        }

        if(index == size){
            addAtTail(val);
            return;
        }

        ListNode temp = getNode(index - 1);
        ListNode node = new ListNode();
        node.val = val;
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void deleteAtHead(){
        head = head.next;
        size--;
        if(head == null) tail = null;
    }

    public ListNode getNode(int index){
        if(index < 0 || index >= size) return null;
        ListNode temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void deleteAtTail(){
        size--;
        ListNode temp = getNode(size-1);
        temp.next = null;
        tail = temp;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        size--;

        if(size == 0){
            head = tail = null;
            return;
        }

        if(index == 0) {
            head = head.next;
            return;
        }

        ListNode temp = getNode(index - 1);
        temp.next = temp.next.next;

        if(index == size){
            tail = temp;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */