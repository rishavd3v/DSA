import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // We can use classes to make user defined data type.
        Student[] students = new Student[5];

        Student student1; // declaration
        student1 = new Student();
        // 'new' dynamically allocates memory and returns reference to it
        student1.name = "Rishav";
        student1.rno= 1;
        student1.marks = 96;
        System.out.println(student1.name);
        System.out.println(student1.rno);
        System.out.println(student1.marks);
    }
}

class Student {
    int rno;
    String name;
    float marks;
}