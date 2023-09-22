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
        // problema de las cartas

        /* Queue<Integer> myQueue = new Queue<>();
        int n = m.sc.nextInt();
        m.sc.nextLine();
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
        } */
        //--------------------------------------
        // problema de la estación de tren
        // eso está muy duro, o por lo menos la manera en la que lo estaba pensando
        // no tiene nada que ver con las soluciones que vi...
        //------------------------------------------

        // problema balanced brackets
        String s = m.sc.nextLine();
        boolean isBalanced = true;
        if(s.length() % 2 == 0){
            Stack<Character> firStack = new Stack<>();
            int separador = s.length() / 2;
            // primera stack
            int count = 0;
            while(count < separador){
                firStack.push(s.charAt(count));
                count++;
            }
            // segunda stack
            Stack<Character> secondStack = new Stack<>();
            count = s.length()-1;
            while (count >= separador) {
                secondStack.push(s.charAt(count));
                count--;
            }
            String matchedPairs = "";
            while (!firStack.isEmpty() && isBalanced) {
                matchedPairs = ""+ firStack.pop() + secondStack.pop();
                    System.out.println("par a evaluar: "+matchedPairs);
                    //System.out.println("evaluaciones: ");
                    //System.out.println(!matchedPairs.equals("{}")); 
                    //System.out.println(!matchedPairs.equals("()"));
                    //System.out.println(!matchedPairs.equals("{}"));     
                    if(matchedPairs.equals("{}")){
                        isBalanced = true;
                    }else if(matchedPairs.equals("()")){
                        isBalanced = true;
                    }else if(matchedPairs.equals("[]")){
                        isBalanced = true;
                    }else{
                        isBalanced = false;
                    }
            }
        }else{
            isBalanced = false;
        }

        if(isBalanced){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
}
