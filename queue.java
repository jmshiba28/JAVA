// Method 1: Using Java's Built-in Queue Interface
import java.util.Queue;
import java.util.LinkedList;
public class queue {
    public static void main(String[] args) {
        //queue = FIFO data structre.
        //A collection designed for holding elements prior to processing linear data structure

        // add = enqueue,offer()
        // rremove = dequeue,poll()

        Queue<Integer> queue = new LinkedList<>();

        // Enqueue (add) elements
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Dequeue (remove) elements
        System.out.println("Dequeued element: " + queue.poll()); // prints 1
        System.out.println("Dequeued element: " + queue.poll()); // prints 2

        // Peek (view) the front element
        System.out.println("Front element: " + queue.peek()); // prints 3

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // prints false
    }
}





// Method 2: Implementing a Custom Queue Class
// public class CustomQueue {
//     private int[] arr;
//     private int front, rear, size, capacity;

//     public CustomQueue(int capacity) {
//         this.capacity = capacity;
//         this.arr = new int[capacity];
//         this.front = this.rear = this.size = 0;
//     }

//     public void enqueue(int element) {
//         if (size == capacity) {
//             System.out.println("Queue is full!");
//             return;
//         }
//         arr[rear] = element;
//         rear = (rear + 1) % capacity;
//         size++;
//     }

//     public int dequeue() {
//         if (size == 0) {
//             System.out.println("Queue is empty!");
//             return -1;
//         }
//         int element = arr[front];
//         front = (front + 1) % capacity;
//         size--;
//         return element;
//     }

//     public int peek() {
//         if (size == 0) {
//             System.out.println("Queue is empty!");
//             return -1;
//         }
//         return arr[front];
//     }

//     public boolean isEmpty() {
//         return size == 0;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         CustomQueue queue = new CustomQueue(5);

//         // Enqueue (add) elements
//         queue.enqueue(1);
//         queue.enqueue(2);
//         queue.enqueue(3);

//         // Dequeue (remove) elements
//         System.out.println("Dequeued element: " + queue.dequeue()); // prints 1
//         System.out.println("Dequeued element: " + queue.dequeue()); // prints 2

//         // Peek (view) the front element
//         System.out.println("Front element: " + queue.peek()); // prints 3

//         // Check if the queue is empty
//         System.out.println("Is queue empty? " + queue.isEmpty()); // prints false
//     }
// }





// Method 3: Using Java's ArrayDeque Class
// import java.util.ArrayDeque;

// public class QueueOperation {
//     public static void main(String[] args) {
//         ArrayDeque<Integer> queue = new ArrayDeque<>();

//         // Enqueue (add) elements
//         queue.add(1);
//         queue.add(2);
//         queue.add(3);

//         // Dequeue (remove) elements
//         System.out.println("Dequeued element: " + queue.poll()); // prints 1
//         System.out.println("Dequeued element: " + queue.poll()); // prints 2

//         // Peek (view) the front element
//         System.out.println("Front element: " + queue.peek()); // prints 3

//         // Check if the queue is empty
//         System.out.println("Is queue empty? " + queue.isEmpty()); // prints false
//     }
// }
