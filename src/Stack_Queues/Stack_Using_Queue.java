package Stack_Queues;
import java.util.LinkedList;
import java.util.Queue;

class stack_1 {
    Queue<Integer> q = new LinkedList<>();

    void push(int x){
        q.add(x);
        for(int i = 0 ; i<q.size() -1 ; i++){
            int k = q.remove();
            q.add(k);
        }
    }

    int pop(){
        return q.remove();
    }

    void top(){
        System.out.println(q.peek());
    }

    int size(){
        return q.size();
    }

}

public class Stack_Using_Queue {
    public static void main(String[] args) {
        stack_1 stack = new stack_1();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.pop());
        stack.top();
        System.out.println(stack.pop());
        stack.push(8);
        System.out.println(stack.size());
        stack.top();
    }
}
