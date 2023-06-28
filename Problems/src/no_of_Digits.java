public class no_of_Digits {

    public static void main(String[] args) {
        int n = 76554555;

        int i=0;
        while (n>0){
            int rem = n%10;
            if (rem == 5){
                i++;
            }
            n = n/10;

        }
        System.out.println(i);
    }
}
