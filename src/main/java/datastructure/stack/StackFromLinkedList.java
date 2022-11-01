package datastructure.stack;

public class StackFromLinkedList {

    private Node top;

    public void push(int data){
        Node node = new Node(data);
        if(isEmpty()){
            top = node;
            return;
        }
        node.next = top;
        top = node;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

}
