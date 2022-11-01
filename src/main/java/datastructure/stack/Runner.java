package datastructure.stack;

public class Runner {

    public static void main(String[] args) {
        StackFromLinkedList stack = new StackFromLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        StackFromArrayList stack2 = new StackFromArrayList();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        while (!stack2.isEmpty()){
            System.out.println(stack2.pop());
        }
    }

}
