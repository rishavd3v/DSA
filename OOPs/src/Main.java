import java.util.Arrays;
class Student {
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello, my name is " + this.name);
    }
    Student(){
        // Constructor
        this.name = "Raj";
        this.marks = 99;
        this.rno = 2;

        // 'this' basically means the reference of object that is created.
    }
    Student(String name,int rno,float marks){
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }
    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}

public class Main {
    public static void main(String[] args) {

        // We can use classes to make user defined data type.

        Student student1; // declaration
        student1 = new Student();
        // 'new' dynamically allocates memory and returns reference to it.
        // object is created in heap and reference to it is created in stack.
        // here 'Student()' is a constructor.

        student1.name = "Rishav";
        student1.rno= 1;
        student1.marks = 96;
        System.out.println(student1.name);
        System.out.println(student1.rno);
        System.out.println(student1.marks);


        Student student2 = new Student();
        System.out.println(student2.name);
        // here values are being assigned by constructor.
        student2.greeting();

        Student student3 = new Student("Rishav Raj",3,88.7f);
        // constructor with params
        student3.greeting();



        Student random = new Student();
        System.out.println(random.name); // Raj

        Student random2 = random;
        random2.name = "Rishav";
        System.out.println(random2.name); // Rishav
        // random and random2 is a reference that is pointing to same object. So changes in one reference will
        // reflect in both.


    }
}