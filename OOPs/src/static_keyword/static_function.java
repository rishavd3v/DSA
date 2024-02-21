package static_keyword;

public class static_function {
    public static void main(String[] args) {
        Student obj = new Student("Rishav",20);
        Student obj1 = new Student("Rahul",20);
//        obj.intro(); // we cannot use static methods via instance reference.


    }
}
class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        intro(this.name);
    }
     static void intro(String name){
        // System.out.println("Hello my name is "+ this.name);
        // cannot use this inside static function.

         System.out.println("Hello my name is "+ name);
         // But we can pass object properties as parameters to access it.
    }
}
