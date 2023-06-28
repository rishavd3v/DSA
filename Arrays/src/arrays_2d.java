import java.util.Arrays;
import java.util.Scanner;

public class arrays_2d {

    public static void main(String[] args) {

        // 2D Arrays can also be called Array of Arrays.

        int[][] arr = new int[3][3];         // It'll be a 3x3 matrix
        //or
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(Arrays.toString(arr[1]));
        Scanner in = new Scanner(System.in);

        // For Loop in 2d Array

        // Input
        for (int row = 0; row < arr.length; row++) {            // For Every Row
            for (int col = 0; col < arr[row].length; col++) {      // For every Column in a Row
                arr[row][col]= in.nextInt();
            }
        }

        // Output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();            // To print new line after each row
        }
        // or
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // Enhanced for Loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }


    }
}
