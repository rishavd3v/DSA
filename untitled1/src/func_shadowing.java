public class func_shadowing {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x);

        int x = 90; // This will shadow previous int.
        // Lower level overrides the Higher Level.

        System.out.println(x);
        print();

    }
    static void print(){
        System.out.println(x); // This will output x=10 bcoz, x=90 is not available in this block.
    }
}
