package datastructure.linkedlist;

public class LinkedListIsPalindrome {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast("l");
        myLinkedList.addLast("e");
        myLinkedList.addLast("v");
        myLinkedList.addLast("e");
        myLinkedList.addLast("l");
        System.out.println("Level is Palindrome: " + isPalindrome(myLinkedList.head));
        myLinkedList.addLast("h");
        myLinkedList.addLast("a");
        myLinkedList.addLast("t");
        System.out.println("Hat is Palindrome: " + isPalindrome(myLinkedList.head));
    }

    private static boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        // find the middle node
        Node midNode = findMiddleNode(head);
        // reverse the 2nd half of linked list
        Node secondHalfStart = reverse(midNode.next);
        // compare both the lists
        Node firstHalfStart = head;
        while (secondHalfStart!=null){
            if(!firstHalfStart.data.equalsIgnoreCase(secondHalfStart.data)){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    private static Node reverse(Node headNode){
        Node current = headNode;
        Node prev = null;
        Node next = null;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private static Node findMiddleNode(Node head){
        Node hare = head;
        Node turtle = head;
        while (hare.next!=null && hare.next.next!=null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

}
