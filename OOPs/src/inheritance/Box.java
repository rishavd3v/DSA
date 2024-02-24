package inheritance;

public class Box {
    public double l;
    public double h;
    public double w;
    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //cube{
    public Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }
    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public Box(Box old){
        this.w = old.w;
        this.h = old.h;
        this.l = old.l;
    }

    public void info(){
        System.out.println("Running box;");
    }
}
