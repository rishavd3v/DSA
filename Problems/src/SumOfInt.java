import java.util.Scanner;

public class SumOfInt {
    // Take input till user press 0 and print sum of all Number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n;

        while ((n = in.nextInt()) !=0) {
            sum += n;

        }
        System.out.println(sum);
    }
}
