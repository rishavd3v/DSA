public class recursion {
    public static void main(String[] args) {

        // A function that calls itself
        num(1);
    }
    static void num(int n) {
        // A recursive function to print numbers till 5
        if (n == 6) {
            return;
        }
        System.out.println(n);
        num(++n);
    }
}