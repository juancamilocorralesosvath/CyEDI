package ui;
import model.*;
import java.util.Scanner;
public class StacksQueuesMain {
    Scanner sc;
    public StacksQueuesMain(){
        sc = new Scanner(System.in);
    }
    public static void main(String[] args) {
        StacksQueuesMain m = new StacksQueuesMain();
/*         // probando mi stack:
        Stack<String> myStack = new Stack<>();

        myStack.push("hello world");
        myStack.push("msg2");
        myStack.push("msg3");
        myStack.push("msg4");
        myStack.push("msg5");
        myStack.push("msg6");

        System.out.println("probando mi stack:");

        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());

        // probando mi queue:
        Queue<String> myQueue = new Queue<>();

        myQueue.enqueue("hello world");
        myQueue.enqueue("msg2");
        myQueue.enqueue("msg3");
        myQueue.enqueue("msg4");
        myQueue.enqueue("msg5");
        myQueue.enqueue("msg6");

        System.out.println("probando mi queue: ");
        System.out.println(myQueue.size());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.size()); 

        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i <= 7; i++) {
            myStack.push(i);
        }
        System.out.println(myStack.peek());
*/
        Queue<Integer> myQueue = new Queue<>();
        int n = m.sc.nextInt();
        if(n > 0) {
            for (int i = 1; i <= n; i++) {
                // System.out.println(i);
                myQueue.enqueue(i);
            }
            // System.out.println(myQueue.peek());
            // debe ser mientras que el tamaño sea mayor a uno. Porque cuando el tamaño sea igual a uno,
            // esa será la carta que queda del proceso.
            String discardedCards = "";
            while (myQueue.size() > 1) {
                discardedCards += myQueue.dequeue() + ",";
                int nextItem = myQueue.dequeue();
                myQueue.enqueue(nextItem);
            }
            System.out.println("Discarded cards: " + discardedCards);
            System.out.println("Remaining card: " + myQueue.dequeue());
        }
    }
}
