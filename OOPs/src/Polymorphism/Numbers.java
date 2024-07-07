package Polymorphism;
class Num{
    int x;
    Num(int x){
        this.x = x;
    }
    @Override
    public String toString(){
        return "obj.x = "+this.x;
    }
}

public class Numbers {
    public static void main(String[] args) {
        Num obj = new Num(8);
        System.out.println(obj);
        // println calls the 'valueOf' method which calls the 'toString' method.
        // But here class 'Num' 'toString' method will override the default one.
    }
}
