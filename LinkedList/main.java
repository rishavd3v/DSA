package LinkedList;

public class main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(6);
        list.insertFirst(4);

        list.insertLast(10);

        System.out.println(list.indexOf(10));

        list.insertAt(11,4);

        list.display();

    }
}
