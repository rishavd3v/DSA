public class revNum {
    public static void main(String[] args) {
        System.out.println(rev(23510));
    }
    static int ans = 0;
    static  int rev(int n){
        if(n==0){
            return ans;
        }
        ans=ans*10+(n%10);
        return rev(n/10);
    }
}
