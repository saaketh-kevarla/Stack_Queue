package Stack_Queues;

class Queue {
    Node start;
    Node end;
    int currSize ;

    public void push(int x){
        if(end == null){
            start = new Node(x);
            end = start;
        }
        else{
            Node k = new Node(x);
            end.next = k;
            end = k;
        }
        System.out.println(x + " is pushed");
        currSize++;
    }

    public int pop(){
        if (start == null){
            System.out.println("The Queue is already empty!");
            System.exit(1);
        }
        int q = start.a;
        if(start.next == null){
            start = null;
            end = null;
        }else{
            Node temp = start;
            start = start.next;
        }
        System.out.println(q + " is popped out!");
        currSize--;
        return q;
    }

    public int top(){
        if(start == null){
            System.out.println("Queue is empty!!");
            System.exit(1);
        }
        return start.a;
    }


}


public class Queue_LL {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(4);
        queue.push(5);
        queue.push(6);
        System.out.println(queue.top());
        System.out.println(queue.pop());
        System.out.println(queue.top());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());


    }
}
