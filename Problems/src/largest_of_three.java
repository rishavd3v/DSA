import java.util.Scanner;

public class largest_of_three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;
        if(b>a) {
            max=b;
        }
        if (c>a){
            max=c;
        }
        System.out.println(max);
    }


}

