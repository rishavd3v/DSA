package multilevel_Inheritance;


import Inheritance.BoxWeight;

public class BoxPrice extends BoxWeight {
    public double cost;
    public BoxPrice(){
        super();
        this.cost = -1;
    }
    public BoxPrice(double l, double w, double h,double weight, double cost){
        super(l,w,h,weight);
        this.cost = cost;
    }
    public BoxPrice(double side,double weight,double cost){
        super(side,weight);
        this.cost = cost;
    }
    public BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }
}
