package datastructure.linkedlist;

public class Runner {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst("is");
        linkedList.addFirst("name");
        linkedList.addLast("adil");
        linkedList.addLast("sachwani");
        linkedList.addFirst("my");
        linkedList.print();
        System.out.println("Size: " + linkedList.getSize());
        linkedList.reverse();
        linkedList.print();
        linkedList.deleteFirst();
        linkedList.deleteLast();
        linkedList.print();
    }

}
