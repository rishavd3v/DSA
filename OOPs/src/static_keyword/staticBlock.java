package static_keyword;

public class staticBlock {

    static int a = 4;
    static int b;
    static{
        //static block

        System.out.println("In Static block");
        b = a*5;
    }
    public static void main(String[] args) {

        staticBlock obj = new staticBlock();
        System.out.println(obj.a); // 4
        System.out.println(obj.b); // 20

        staticBlock obj2 = new staticBlock();
        System.out.println(obj2.b); // still 20
        // value of b will not update because static block in ran only once.
        // Static block is ran only once when the first object is created i.e. when the classes are loaded.


        obj.b = 10;
        System.out.println(obj.b); // 10
        System.out.println(obj2.b); // 10
        // value of b will be same for obj and obj2. Since it is static it is not associated with any instance.

    }
}
