import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        // This is called Typecasting
//        int num = (int) (67.547f);
//        System.out.println(num);    // It'll output 67 because of typecasting.

//        int a = 259;
//        byte b = (byte)(a);
//        System.out.println(b);
//        // It'll output difference of a and b bcoz byte can only store upto 256.
//
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d= (a*b)/c;
//        System.out.println(d);

        byte b = 40;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.14f;
        double d = 1.1247;
        double result = (f*b) + (i/c) - (d-s);
        System.out.println((f*b) + "  " + (i/c) + "  " + (d-s));
                    //     float        + int          - double = double

        System.out.println(result);


    }
}
