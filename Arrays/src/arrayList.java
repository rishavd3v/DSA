import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    // We use array list when there is no fixed size of array.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        ArrayList<Integer> arr = new ArrayList<>(5);

        // To add items
        list.add(5);
        list.add(99);
        list.add(100);
        list.add(58);
        list.add(47);
        System.out.println(list);   // to print list

        list.set(0, 44);            // Change 0th index to 44
        System.out.println(list);
        System.out.println(list.get(1)); // To get item at an index

        // Input using for Loop
        for(int i=0; i<5; i++){
            arr.add(in.nextInt());
        }
        // Output using loop
        for(int i=0; i<5; i++ ){
            System.out.println(arr.get(i));
        }
    }
}
