public class diamond {
    public static void main(String[] args) {
        int n = 5;
        // pattern will be same as 'traingle2'. We will just add whitespaces.
        for(int row = 0;row<2*n;row++){
            int totalCol = row>n? 2*n-row : row;
            int totalSpace = n-totalCol;
            for (int s = 0; s < totalSpace; s++) {
                System.out.print(" ");
            }
            for(int col = 0;col<totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}