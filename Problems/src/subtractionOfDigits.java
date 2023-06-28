import java.util.Scanner;

public class subtractionOfDigits {
    public static void main(String[] args) {

        // Subtract the Product and Sum of Digits of a number.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = in.nextInt();
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n%10;
            sum = sum + digit;
            product = product*digit;
            n = n/10;

        }
        System.out.println("Product of Digits is: "+ product);
        System.out.println("Sum of Digits is: "+ sum);
        System.out.println("Difference of Product and Sum is " + (product - sum));

    }
}
