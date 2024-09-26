//Method 2: Implementing a Custom Stack Class
class Stack {
    private int maxSize;  // maximum size of the stack
    private int top;      // top pointer to track the top element
    private int[] stackArray;  // array to store stack elements

    // Constructor to initialize the stack with a given size
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // stack is initially empty
    } 

    // Push operation to add an element to the top of the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow: Unable to push " + value);
            return;
        }
        stackArray[++top] = value;  // increment top and add value
    }

    // Pop operation to remove and return the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow: Unable to pop");
            return -1; // return -1 if stack is empty
        }
        return stackArray[top--];  // return top element and decrement top
    }

    // Peek operation to view the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Main method to demonstrate the stack functionality
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        stack.pop();
        System.out.println("Top element after pop is: " + stack.peek());
    }
}





//Method 3: Using an Array to Implement a Stack


// public class ArrayStack {
//     private int maxSize;
//     private int top;
//     private int[] stackArray;

//     public ArrayStack(int size) {
//         maxSize = size;
//         stackArray = new int[maxSize];
//         top = -1;
//     }

//     public void push(int element) {
//         if (top >= maxSize - 1) {
//             System.out.println("Stack is full. Cannot push element " + element);
//             return;
//         }
//         stackArray[++top] = element;
//     }

//     public int pop() {
//         if (top < 0) {
//             System.out.println("Stack is empty. Cannot pop element");
//             return -1;
//         }
//         return stackArray[top--];
//     }

//     public int peek() {
//         if (top < 0) {
//             System.out.println("Stack is empty. Cannot peek element");
//             return -1;
//         }
//         return stackArray[top];
//     }

//     public boolean isEmpty() {
//         return (top == -1);
//     }

//     public int size() {
//         return top + 1;
//     }
// }

// public class StackOperation {
//     public static void main(String[] args) {
//         ArrayStack stack = new ArrayStack(5);

//         // Push elements onto the stack
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);

//         // Pop elements from the stack
//         System.out.println("Popped element: " + stack.pop());
//         System.out.println("Popped element: " + stack.pop());

//         // Peek at the top element
//         System.out.println("Top element: " + stack.peek());

//         // Check if the stack is empty
//         System.out.println("Is stack empty? " + stack.isEmpty());

//         // Get the size of the stack
//         System.out.println("Stack size: " + stack.size());
//     }
// }



