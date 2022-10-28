package datastructure.linkedlist;

public class MyLinkedList {

    private Node head;
    private int size;

    public void addFirst(String data) {
        Node node = new Node(data);
        size++;
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addLast(String data){
        Node node = new Node(data);
        size++;
        if(head == null){
            head = node;
            return;
        }
        Node currNode = head;
        while (currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = node;
    }

    public void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next!=null){
            secondLastNode = secondLastNode.next;
            lastNode = lastNode.next;
        }
        secondLastNode.next = null;
        size--;
    }

    public void print(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        Node currNode = head;
        while (currNode!=null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public void reverse(){
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public int getSize(){
        return size;
    }

}
