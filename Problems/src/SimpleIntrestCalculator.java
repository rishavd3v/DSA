import java.util.Scanner;
public class SimpleIntrestCalculator {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Principle Amt: ");
            float p = input.nextInt();
            System.out.print("Rate: ");
            double R = input.nextDouble();
            double r = R/100;
            System.out.print("Time Period(in yrs): ");
            int t = input.nextInt();
            double a = p*(1+r*t);
            float ans = (float) (a);

            System.out.println("YOur amount after " + t + "Yrs. with interest rate of " + R + "% is "+ ans );





        }
    }
