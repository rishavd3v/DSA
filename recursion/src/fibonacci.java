public class fibonacci {
    // find the nth fibonacci number.
    // 0 1 1 2 3 5 8 13.....

    // breaking down the problem into smaller parts
    // Fib(N) = Fib(N-1) + Fib(N-2)
    // Fib(N-1) = Fib(N-2) + Fib(N-3)
    // Fib(N-2) = Fib(N-3) + Fib(N-4)

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    static int fib(int n){
        if(n<2) return n;
        return fib(n-1) + fib(n-2);
    }
}
