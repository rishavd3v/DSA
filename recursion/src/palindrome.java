public class palindrome {
    public static void main(String[] args) {
        System.out.println(palin(12321));
    }
    static int ans = 0;
    static  int rev(int n){
        if(n==0){
            return ans;
        }
        ans=ans*10+(n%10);
        return rev(n/10);
    }
    static boolean palin(int n){
        return n==rev(n);
    }
}