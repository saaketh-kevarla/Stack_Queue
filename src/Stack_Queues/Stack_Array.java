package Stack_Queues;

class Stack_A{
    int size;
    int[] arr ;
    int top = -1;

    public Stack_A(int size){
        this.size = size;
        arr = new int[size];
    }

    int top(){
        return arr[top];
    }

    int pop(){
        int k = top;
        top = top-1;
        return arr[k];
    }

    void push(int x){
        top++;
        arr[top] = x;
    }

    int size(){
        return top+1;
    }

}

public class Stack_Array {
    public static void main(String[] args) {
//        System.out.println("hello");
        Stack_A stack1 = new Stack_A(1000);
        stack1.push(5);
        System.out.println(stack1.size());
        stack1.push(6);
        stack1.push(7);
        System.out.println(stack1.pop());
        System.out.println(stack1.size());

    }
}


