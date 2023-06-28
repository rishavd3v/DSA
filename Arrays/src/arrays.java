import java.util.Arrays;
import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {

        // Array is a collection of Element.

        // Syntax
        // datatype[] var_name = new datatype[size];

        // Storing 5 int
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 32;
        arr[3] = 45;
        arr[4] = 5;
        // or
        int [] arr2 = {1,3,32,45,5};
        arr2 [2] = 69;                                   // To change the value
        System.out.println(arr2[2]);

        System.out.println(Arrays.toString(arr));       // 'Arrays.toString' can be used to print DS.arrays.

        Scanner in = new Scanner(System.in);

        // Input using For Loop
        for (int i =0; i<arr.length; i++){              // 'arr.length' can be used when you don't know it size.
            arr[i] = in.nextInt();
        }
        // Output using Loop
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }


    }
}
