//Method 2: Implementing a Custom Stack Class

 class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int element) {
        if (top >= maxSize - 1) {
            System.out.println("Stack is full. Cannot push element " + element);
            return;
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty. Cannot pop element");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty. Cannot peek element");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }
}

 public class CustomStack {
    public static void main(String[] args) {
        Stack number = new Stack(5);

        // Push elements onto the stack
        number.push(1);
        number.push(2);
        number.push(3);
        number.push(4);

        number.peek();

        // Pop elements from the stack
        System.out.println("Popped element: " + number.pop());
        System.out.println("Popped element: " + number.pop());

        // Peek at the top element
        System.out.println("Top element: " + number.peek());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + number.isEmpty());

        // Get the size of the stack
        System.out.println("Stack size: " + number.size());
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



