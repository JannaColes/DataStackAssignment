package Stacks;

class Node {
    int value;
    Node next;

    public Node (int value) {
        this.value = value;
        this.next = null;
    }
}

public class StackLinkedList {
    Node head;
    int size;

    public StackLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println("The value is successfully inserted");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            int value = head.value;
            head = head.next;
            size--;
            System.out.println("Popped value: " + value);
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            int value = head.value;
            System.out.println("Peeked value: " + value);
            return value;
        }
    }

    public void deleteStack() {
        head = null;
        size = 0;
        System.out.println("The stack is deleted");
    }

    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.isEmpty();

        stackLinkedList.pop();
        stackLinkedList.peek();
        stackLinkedList.deleteStack();
    }
}
