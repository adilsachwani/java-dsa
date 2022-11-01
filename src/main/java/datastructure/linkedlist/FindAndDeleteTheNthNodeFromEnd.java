package datastructure.linkedlist;

public class FindAndDeleteTheNthNodeFromEnd {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addLast("my");
        linkedList.addLast("name");
        linkedList.addLast("is");
        linkedList.addLast("adil");
        linkedList.addLast("aslam");
        linkedList.addLast("sachwani");
        linkedList.print();
        findAndDeleteTheNthNodeFromEnd(linkedList.head, 3);
        linkedList.print();
    }

    public static void findAndDeleteTheNthNodeFromEnd(Node head, int n){
        Node current = head;
        // 1st: finding the size of the linked list
        int size = 0;
        while (current!=null){
            current = current.next;
            size++;
        }
        // 2nd: calculating the index to delete
        int pos = size - n;
        if(pos == 0){
            head = head.next;
            return;
        }
        current = head;
        for (int i=0 ;i<pos-1; i++){
            current = current.next;
        }
        // 3rd: deleting the nth node from the end
        current.next = current.next.next;
    }

}
