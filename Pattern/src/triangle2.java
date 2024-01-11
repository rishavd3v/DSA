public class triangle2 {
    public static void main(String[] args) {
        // Find no of rows
        // Find relation between rows and column.
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

        int n = 5;
        for (int i = 0; i < 2*n; i++) {
//            if(i>n){
//                totalCol = 2*n-i;
//            }else totalCol = i;
            int totalCol = i>n? 2*n-i : i;
            for(int j=0;j<totalCol;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
