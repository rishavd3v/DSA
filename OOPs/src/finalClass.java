public class finalClass {
    public static void main(String[] args) {
        // final is used to declare constants
        // Can also be used to prevent overriding
        final int a = 10;
//         a = 20; // cannot reassign

        final A obj1 = new A();
        System.out.println(obj1.name);
        obj1.name = "Vader"; // we can change properties

//        obj1 = new A(); // we cannot reassign

    }


}
class A{
    String name;
    A(){
        this.name = "John Snow";
    }
}
