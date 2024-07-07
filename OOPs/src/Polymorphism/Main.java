package Polymorphism;
public class Main {
    public static void main(String[] args) {
        // Compile time polymorphism - Method overloading
        // Runtime polymorphism - Method overriding
        // Method Overloading - Methods with same identifier but with different type, params, return type, ordering.

        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}