public class func_overloading {
    public static void main(String[] args) {
        fun(6);
        fun("Raj");
    }

    static void fun(int a) {
        System.out.println(a);
    }
    static void fun (String a){
        System.out.println(a);
    }
}
