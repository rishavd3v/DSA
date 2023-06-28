import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.nextLine();
        str = str.toLowerCase();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        if (str.equals(rev)) {
            System.out.println(str + " is Palindrome");
        } else System.out.println(str + " is not Palindrome");

    }
}
