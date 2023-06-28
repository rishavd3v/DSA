import java.util.Scanner;

public class FactorialOfInt {
    // Print Factorial a Number

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any Integer");
        int n = in.nextInt();
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact *= i;

        }
        System.out.println("Factorial of " + n + " is " +fact);
    }
}
