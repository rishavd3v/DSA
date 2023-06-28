public class reverse_num {
    public static void main(String[] args) {
        int num = 14758;
        int ans = 0;
        while (num>0) {
            int rem = num%10;
            ans = ans*10 + rem;
            num/=10;
        }

        System.out.println(ans);
    }
}
