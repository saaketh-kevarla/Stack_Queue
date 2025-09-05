package Stack_Queues;

import java.util.Stack;

class Queue_1{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        System.out.println(x +" is pushed");
    }

    int pop(){
        if(s1.isEmpty()){
            System.out.println("Its empty duh..");
            System.exit(1);
        }
        return s1.pop();
    }

    int peek(){
        if(s1.isEmpty()){
            System.out.println("Its empty duh..");
            System.exit(1);
        }
        return s1.peek();
    }


}

public class Queue_Using_Stack {
    public static void main(String[] args) {
        Queue_1 queue = new Queue_1();
        queue.push(5);
        queue.push(6);
        queue.push(7);
        System.out.println(queue.pop());
        System.out.println(queue.peek());

    }
}
