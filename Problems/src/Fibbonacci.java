import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        // Printing Fibonacci Seq. upto nth term.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int i = 2;
        int c;
        while (i<=n){
            c = a+b;
            a = b;
            b = c;
            i++;
            System.out.println(c);

        }

    }


}
