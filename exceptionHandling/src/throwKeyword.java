public class throwKeyword {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;

        try{
            int ans = divide(a, b);
            System.out.println(ans);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero");
            // custom exception will be thrown to catch block.
        }
        return a/b;
    }
}
