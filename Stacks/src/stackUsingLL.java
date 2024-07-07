public class stackUsingLL {
    Node head;
    int size;
    public class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public void push(int val){
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }
    public int pop(){
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }
    public int peek(){
        int x = head.val;
        return x;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stackUsingLL stack = new stackUsingLL();
        stack.push(10);
        stack.push(11);
        stack.push(12);

        stack.pop();
        stack.display();
        System.out.println(stack.isEmpty());

    }

}
