public class CSE408 {

    public static void main(String[] args) {
        int[] candles = {4,4,1,3};

        int max = 0;
        for(int x:candles){
            max = Math.max(x, max);
        }

        int count = 0;
        for(int x:candles){
            if(x==max){
                count++;
            }
        }

        System.out.println(count);
    }
}
