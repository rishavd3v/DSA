package Queue;

class Queue1{
    int capacity = 0;
    int size = 0;
    Node head = null;

    Queue1(int x){
        capacity = x;
    }
    public void enqueue(int x){
        if(size==capacity){
            System.out.println("Queue is full");
            return;
        }
        Node newNode = new Node(x);

        if(head==null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }
    public int deque(){
        int x = head.val;
        head = head.next;
        size--;

        return x;
    }
    public boolean isEmpty(){
        return size==0;
    }
    class Node{
       int val;
       Node next;

       Node(int x){
           this.val = val;
       }
    }
}
public class queueUsingLL {
    Queue1 q = new Queue1(5);
}
