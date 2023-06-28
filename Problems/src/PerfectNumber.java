import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
         for (int i =1; i<a; i++){
             if(a%i==0){
                 sum += i;
             }
         }
         if (sum == a){
             System.out.println("Perfect Number");
         }
         else System.out.println("Not a Perfect Number");


    }
}
