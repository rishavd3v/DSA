public class PrettyPrinting {
    public static void main(String[] args) {

        System.out.printf("Hello my name is %s","Rishav");
        System.out.println();
        System.out.printf("FirstName: %s, LastName: %s %n","Rishav","Raj");

        // Decimal precision
        float a = 814.5774f;
        System.out.printf("Formatted no. %.2f",a);
        System.out.println();

        // To print the value of PI
        System.out.printf("Pie: %.2f",Math.PI);


    }
}
