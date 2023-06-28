import java.util.Scanner;

public class largestOfInt {
    // Take input until user press 0 and print largest number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int large = 0;
        while ((n = in.nextInt()) !=0) {
            if (n>large){
                large = n;
            }

        }
        System.out.println(large);
    }
}

