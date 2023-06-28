import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = input.nextInt();
        if (n%2==0){
            System.out.println(n + " is Even");
        }
        else System.out.println(n+ " is Odd");
    }
}
