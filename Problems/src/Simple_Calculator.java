import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ans=0;
        System.out.print("Enter Num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Num2: ");
        int num2 = input.nextInt();
        System.out.print("Enter Operator: ");
        int op = input.next().charAt(0);
        if (op == '+'){
            ans = num1 + num2;
        }
        else if (op == '-'){
            ans = num1 - num2;
        }
        else if (op == '*'){
            ans = num1 * num2;
        }
        else if (op == '/') {
            ans = num1 / num2;
        }
        else {
            System.out.println("Invalid");
        }

        System.out.println(ans);



    }
}
