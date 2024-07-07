package Polymorphism;

public class Circle extends Shapes{

    @Override // this is called annotation
    void area(){
        System.out.println("Circle area is pi*r*r");
    }
    // this function will run when obj of Circle is created.
    // It will override 'area()' method of class 'Shapes'.


}
