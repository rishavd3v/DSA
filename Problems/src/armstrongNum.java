import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
        // If Sum of Cube of Digits is equal to the number then it's an Armstrong Number.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter No.");
        int num = input.nextInt();
        int check, rem, sum=0;
        check = num;
        while (check!=0){
            rem = check%10;
            sum = sum + (rem*rem*rem);
            check = check/10;
        }
        if (sum==num){
            System.out.println(num + " is an Armstrong number");
        } else System.out.println(num + " is not an Armstrong number");
    }
}
