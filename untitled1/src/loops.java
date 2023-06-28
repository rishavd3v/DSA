import java.util.Scanner;

public class loops {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Printing no. from 1 to 5

        // Using While Loop
//        int i = 1;
//        while (i < 6) {
//            System.out.print(i + ",");
//            i++;
//        }


        // Using For loop
//        for ( int j=1; j<6; j++){
//            System.out.print(j +",");
//        }


        // Printing numbers from 1 to n

        int n = input.nextInt();

        // Using for While
//        for (int i = 1; i<= n; i++) {
//            System.out.print(i + ",");
//        }

        // Using While Loop
        int a = 1;
        while (a<=n) {
            System.out.println(a);
            a++;
        }




    }

}
