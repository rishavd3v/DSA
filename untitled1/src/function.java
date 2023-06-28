import java.util.Scanner;

public class function {
    // Take input of 2 number adn print Sum.

    public static void main(String[] args) {
        // sum();                    // To call function 'sum'

//        int ans = sum2();            // To call function 'sum2'
//        System.out.println(ans);

        int ans2 = sum3(20,30);   // a=20 and b= 30 will be passed to sum3
        System.out.println(ans2);

    }
//   static void sum(){
//        Scanner in = new Scanner(System.in);
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println(sum);
//    }

//    static int sum2 (){                         // Return type Function
//        Scanner in = new Scanner(System.in);
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        return sum;
//
//    }

    static int sum3(int a, int b){        // Pass value Function
        int sum = a+b;
        return sum;
    }

}
