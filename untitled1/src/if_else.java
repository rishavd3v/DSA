import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salary;
        salary = input.nextInt();


        if (salary>10000){
            salary = salary + 2000;  // Can be written as salary += 2000.
        }else {
            salary += 1000;
        }

        System.out.println(salary);
    }
}
