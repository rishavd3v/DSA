import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Roll no. ");
        int rollno = input.nextInt();
        System.out.print("Please Enter your name ");
        String name = input.next();
        System.out.println("Your Roll no is " + rollno);
        System.out.println("Your name is " + name);
    }
}
