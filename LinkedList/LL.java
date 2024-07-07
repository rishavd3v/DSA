package LinkedList;

public class LL {
    Node head;
    Node tail;
    int size=0;
    public void insertLast(int val){
        Node temp = new Node(val);
        if(head==null) {
            head = temp;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp;
        size++;
    }

    public void insertFirst(int val){
        Node temp = new Node(val);
        temp.next = head;
        head = temp;

        if(tail==null){
            tail = head;
        }
        size++;
    }

    public void insertAt(int val,int pos){
        Node temp = head;
        int count = 0;

        if(pos==0){
            insertFirst(val);
            return;
        }
        if(pos==size){
            insertLast(val);
            return;
        }
        if(pos>size){
            System.out.println("Invalid Index");
            return;
        }

        while(count<pos-1){
            temp = temp.next;
            count++;
        }

        Node newNode = new Node(val);
        Node temp2 = temp.next;
        temp.next = newNode;
        newNode.next = temp2;
        size++;
    }


    public void display(){
        if(head==null){
            System.out.println("LinkedList is empty");
        }
        Node temp = head;
        System.out.print("head -> ");
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("Size = "+size);
    }

    public int indexOf(int val){
        int index = 0;
        Node temp = head;
        while(temp!=null){

            if(temp.data==val){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
