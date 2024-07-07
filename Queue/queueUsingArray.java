package Queue;

class Queue{
    int[] arr;
    int size=0;
    int capacity;
    Queue(int x){
        arr = new int[x];
        capacity = x;
    }

    public void enqueue(int x){
        if(size==capacity){
            System.out.println("Queue is full");
            return;
        }
        arr[size] = x;
        size++;
    }
    public int dequeue(){
        int x = arr[0];
        for(int i=1;i<size;i++){
            arr[i-1] = arr[i];
        }
        size--;

        return x;
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return size==0;
    }


}
public class queueUsingArray {

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.display();
        System.out.println(q.size);
        System.out.println(q.capacity);

    }
}
