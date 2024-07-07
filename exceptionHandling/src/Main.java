public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            // first do this
            int ans = a/b;
        }
        catch(ArithmeticException e){
            // if exception, do this
            System.out.println(e.getMessage());
        }
        finally {
            // always do this
            System.out.println("Finally block");
        }
    }
}