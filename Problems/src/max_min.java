import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        print();

    }
    static void print(){
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a");
        a = in.nextInt();
        System.out.println("Enter b");
        b = in.nextInt();
        System.out.println("Enter c");
        c = in.nextInt();

        int greatest, smallest;

        if (a>b && a>c){
            greatest = a;
            smallest = Math.min(b, c);

        }
        else if (b>a && b>c){
            greatest = b;
            smallest = Math.min(a,c);

        }
        else {
            greatest = c;
            smallest = Math.min(a, b);
        }

        System.out.println("Greatest number is: " + greatest);
        System.out.println("Smallest number is: " + smallest);


    }
}
