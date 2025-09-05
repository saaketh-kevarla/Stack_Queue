package Stack_Queues;

//stack using LinkedList
class stack{
    Node p;
    Node head;
    int currSize;

    public void push(int a){
        if(currSize == 0) {
            p = new Node(a);
            head = p;
        }
        else{
            Node q = new Node(a);
            q.next = head;
            head = q;
        }
        currSize++;
    }

    public int pop(){
        if(currSize == 0){
            System.out.println("Stack is Empty");
            System.exit(1);
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        System.out.println(temp.a +" is popped");
        currSize--;

        return temp.a;
    }

    public int top(){
        if(currSize == 0){
            System.out.println("Stack is empty...");
            System.exit(1);
        }
        return head.a;
    }
}

class Node{
    int a;
    Node next;

    public Node(int x){
        this.a = x;
    }
}

public class Stack_LL {
    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.top());
        stack.push(4);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        stack.pop();

    }
}
