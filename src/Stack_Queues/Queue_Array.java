package Stack_Queues;

class Queue_A{
    int size; //maxsize
    int[] arr;
    int start,end,currSize;

    public Queue_A(int size){
        this.size = size;
        arr = new int[size];
        start = -1;
        end = -1;
        currSize = 0;
    }

    public void push(int x){
        if(currSize == size){
            System.out.println("Queue is full");
            System.exit(1);
        }
        if(end == -1){
            end = 0;
            start = 0;
        }
        else{
            end = (end+1)%size;
        }
        arr[end] = x;
        System.out.println(x+" element is pushed");
        currSize++;
    }

    public int pop(){
        if(start == -1){
            System.out.println("Queue is already empty .....");
        }
        int z = arr[start];
        if(currSize == 1){
            start = -1;
            end = -1;
        }
        else
            start = (start +1)%size;

        System.out.println(z+" element is popped");
        currSize--;
        return z;
    }

    public int size(){
        return currSize;
    }

    public int top(){
        if(start == -1){
            System.out.println("Queue is empty");
            System.exit(1);
        }
        return arr[start];
    }



}

public class Queue_Array {
    public static void main(String[] args) {
        Queue_A queue1 = new Queue_A(4);
        queue1.push(5);
        queue1.push(6);
        queue1.pop();
        queue1.push(7);
        System.out.println(queue1.top());
        queue1.push(8);
        System.out.println(queue1.size());
        queue1.push(9);
        queue1.push(10);
    }
}
