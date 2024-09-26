class DequeNode {
    int data;
    DequeNode prev, next;

    public DequeNode(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

class CustomDeque {
    private DequeNode front, rear;

    public CustomDeque() {
        front = rear = null;
    }

    // Insert element at the front
    public void insertFront(int data) {
        DequeNode newNode = new DequeNode(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        System.out.println(data + " inserted at the front");
    }

    // Insert element at the rear
    public void insertRear(int data) {
        DequeNode newNode = new DequeNode(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " inserted at the rear");
    }

    // Delete element from the front
    public void deleteFront() {
        if (front == null) {
            System.out.println("Deque is empty");
            return;
        }
        System.out.println(front.data + " removed from the front");
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null; // If the deque becomes empty
        }
    }

    // Delete element from the rear
    public void deleteRear() {
        if (rear == null) {
            System.out.println("Deque is empty");
            return;
        }
        System.out.println(rear.data + " removed from the rear");
        rear = rear.prev;
        if (rear != null) {
            rear.next = null;
        } else {
            front = null; // If the deque becomes empty
        }
    }

    // Reverse the deque
    public void reverseDeque() {
        if (front == null) {
            System.out.println("Deque is empty");
            return;
        }

        DequeNode current = front;
        DequeNode temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        // Swap front and rear
        temp = front;
        front = rear;
        rear = temp;

        System.out.println("Deque reversed");
    }

    // Print deque
    public void display() {
        if (front == null) {
            System.out.println("Deque is empty");
            return;
        }

        DequeNode current = front;
        System.out.print("Deque: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Deque {
    public static void main(String[] args) {
        CustomDeque deque = new CustomDeque();

        // Insert elements
        deque.insertFront(10);
        deque.insertRear(20);
        deque.insertFront(5);
        deque.insertRear(30);
        deque.display();

        // Delete elements
        deque.deleteFront();
        deque.deleteRear();
        deque.display();

        // Reverse deque
        deque.reverseDeque();
        deque.display();
    }
}
