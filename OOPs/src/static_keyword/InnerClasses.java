package static_keyword;

// outside classes cannot be static

// static class A{ //error

// }

public class InnerClasses {

    static class Test{
        int a;
        public Test(int a) {
            this.a = a;
        }
    }

    public static void main(String[] args) {
        // Test a = new Test(5); // error
        // We cannot directly reference 'test' class because it is dependent on an outer class i.e 'InnerClasses'.

        Test obj1 = new Test(100);
        Test obj2 = new Test(200);
        System.out.println(obj1.a); // 100
        System.out.println(obj2.a); // 200

        // Here class 'Test' is static but still have different value for different objects. That is because,
        // static class does not depends on the object of its outer class (InnerClasses), but can have instances of
        // inner classes (main).



    }
}