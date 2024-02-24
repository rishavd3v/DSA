package inheritance;

public class BoxWeight extends Box{
    // BoxWeight class will inherit the properties of class 'Box'.
    // here 'BoxWeight' is subclass and 'Box' is a super-class.
    public double weight;

    public BoxWeight(){
        super();
        this.weight = -1;
    }
    public BoxWeight(double l, double w, double h, double weight){
        super(l,w,h); // calling parent's constructor.
        // used to initialise values of parent class.
        this.weight = weight;

    }
    public BoxWeight(double side,double weight){
        super(side);
        this.weight = weight;
    }
    public BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }
}
