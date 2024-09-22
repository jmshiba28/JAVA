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







// Algorithm for Queue Operations in C:

// Enqueue (Insert):

// Check if the queue is full.
// If full, print "Queue is full. Cannot insert." and return.
// Otherwise, add the element to the rear of the queue.
// Increment the rear index.
// Dequeue (Delete):

// Check if the queue is empty.
// If empty, print "Queue is empty. Cannot delete." and return.
// Otherwise, store the front element in a variable.
// Print the stored element as the dequeued element.
// Increment the front index.
// Peek (View Front):

// Check if the queue is empty.
// If empty, print "Queue is empty. Cannot peek." and return -1.
// Otherwise, return the front element.
// Check Queue Empty:

// Check if the size of the queue is 0.
// If yes, return true.
// Otherwise, return false.





// #include <stdio.h>
// #include <stdbool.h>

// #define MAX_SIZE 5

// int queue[MAX_SIZE];
// int front = 0, rear = -1;
// int size = 0;

// void enqueue(int element) {
//     if (size == MAX_SIZE) {
//         printf("Queue is full. Cannot insert.\n");
//         return;
//     }
//     queue[++rear] = element;
//     size++;
// }

// int dequeue() {
//     if (size == 0) {
//         printf("Queue is empty. Cannot delete.\n");
//         return -1;
//     }
//     int dequeued_element = queue[front];
//     front++;
//     size--;
//     return dequeued_element;
// }

// int peek() {
//     if (size == 0) {
//         printf("Queue is empty. Cannot peek.\n");
//         return -1;
//     }
//     return queue[front];
// }

// bool is_empty() {
//     return size == 0;
// }

// int main() {
//     enqueue(1);
//     enqueue(2);
//     enqueue(3);

//     printf("Dequeued element: %d\n", dequeue()); // prints 1
//     printf("Dequeued element: %d\n", dequeue()); // prints 2

//     printf("Front element: %d\n", peek()); // prints 3

//     printf("Is queue empty? %s\n", is_empty() ? "true" : "false"); // prints false

//     return 0;
// }