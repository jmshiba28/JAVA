// Method 1: Using Java's Built-in Stack Class

// import java.util.Stack;
// public class stack {
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>();

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




// Here are the algorithm steps for stack operations in C language:

// Push Operation:

// Check if the stack is full by comparing the top index with the maximum size of the stack.
// If the stack is full, print an error message and exit.
// If the stack is not full, increment the top index to point to the next empty space.
// Add the data element to the stack location, where the top index is pointing.
// Return success.
// Pop Operation:

// Check if the stack is empty by comparing the top index with -1.
// If the stack is empty, print an error message and exit.
// If the stack is not empty, return the value stored at the top index.
// Decrement the top index to point to the previous element.
// Return success.
// Peek Operation:

// Check if the stack is empty by comparing the top index with -1.
// If the stack is empty, print an error message and exit.
// If the stack is not empty, return the value stored at the top index.
// Return success.
// IsEmpty Operation:

// Check if the top index is equal to -1.
// If the top index is equal to -1, return true (stack is empty).
// If the top index is not equal to -1, return false (stack is not empty).
// IsFull Operation:

// Check if the top index is equal to the maximum size of the stack.
// If the top index is equal to the maximum size of the stack, return true (stack is full).
// If the top index is not equal to the maximum size of the stack, return false (stack is not full).



// Push Operation:
// void push(Stack* stack, int element) {
//     if (stack->top >= MAX_SIZE - 1) {
//         printf("Stack is full. Cannot push element %d\n", element);
//         return;
//     }
//     stack->data[++stack->top] = element;
// }



// Pop Operation:
// int pop(Stack* stack) {
//     if (stack->top < 0) {
//         printf("Stack is empty. Cannot pop element\n");
//         return -1;
//     }
//     return stack->data[stack->top--];
// }


// Peek Operation:
// int peek(Stack* stack) {
//     if (stack->top < 0) {
//         printf("Stack is empty. Cannot peek element\n");
//         return -1;
//     }
//     return stack->data[stack->top];
// }



// IsEmpty Operation:
// int isEmpty(Stack* stack) {
//     return (stack->top == -1);
// }


// IsFull Operation:
// int isFull(Stack* stack) {
//     return (stack->top == MAX_SIZE - 1);
// }


// #include <stdio.h>

// #define MAX_SIZE 100

// typedef struct {
//     int data[MAX_SIZE];
//     int top;
// } Stack;

// void push(Stack* stack, int element) {
//     if (stack->top >= MAX_SIZE - 1) {
//         printf("Stack is full. Cannot push element %d\n", element);
//         return;
//     }
//     stack->data[++stack->top] = element;
// }

// int pop(Stack* stack) {
//     if (stack->top < 0) {
//         printf("Stack is empty. Cannot pop element\n");
//         return -1;
//     }
//     return stack->data[stack->top--];
// }

// int peek(Stack* stack) {
//     if (stack->top < 0) {
//         printf("Stack is empty. Cannot peek element\n");
//         return -1;
//     }
//     return stack->data[stack->top];
// }

// int isEmpty(Stack* stack) {
//     return (stack->top == -1);
// }

// int isFull(Stack* stack) {
//     return (stack->top == MAX_SIZE - 1);
// }

// int main() {
//     Stack stack;
//     stack.top = -1;

//     // Push elements onto the stack
//     push(&stack, 1);
//     push(&stack, 2);
//     push(&stack, 3);

//     // Pop elements from the stack
//     printf("Popped element: %d\n", pop(&stack));
//     printf("Popped element: %d\n", pop(&stack));

//     // Peek at the top element
//     printf("Top element: %d\n", peek(&stack));

//     // Check if the stack is empty
//     printf("Is stack empty? %d\n", isEmpty(&stack));

//     // Check if the stack is full
//     printf("Is stack full? %d\n", isFull(&stack));

//     return 0;
// }