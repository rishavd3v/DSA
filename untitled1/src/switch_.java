import java.util.Scanner;

public class switch_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("Red Fruit");
                break;
            case "Orange":
                System.out.println("Round");
                break;
            default:
                System.out.println("Invalid");
                break;
        }


    }
}
