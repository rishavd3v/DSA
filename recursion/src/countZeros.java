public class countZeros{
    public static void main(String[] args) {
        System.out.println(countZero(10020,0));
    }


    static int countZero(int n,int count){
        if(n==0){
            return count;
        }
        return n%10==0 ? countZero(n/10,++count) : countZero(n/10,count);
    }
}
