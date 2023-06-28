public class function_2 {
    public static void main(String[] args) {
        // Scoping
        int a = 10;
        int b = 12;

        {
            // Block Scope

            // int a = 14;
            // Cannot initialize bcoz it's already initialized in the same method. But you can change the value.

            int c = 32;
            // Values initialize in this block will remain in the block.
        }
        // Scoping in Loop

        for ( int i=0; i<4; i++){
            System.out.println(i);
            int num = 21;
        }
        // Anything initialized outside the block can be used inside the block. But anything initialized inside cannot be used outside.

    }
}
