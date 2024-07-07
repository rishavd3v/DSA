package Inheritance;

import multilevel_Inheritance.BoxPrice;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        System.out.println(box1.l+" "+box1.w+" "+box1.h);
//
//        Box cube = new Box(5);
//        System.out.println(cube.l+" "+cube.w+" "+cube.h);
//
//        Box box2 = new Box(cube);
//        System.out.println(box2.l+" "+box2.w+" "+box2.h);

        //BoxWeight box3 = new BoxWeight(4,3,2,1);
        //System.out.println(box3.l+" "+box3.w+" "+box3.h+" "+box3.weight);

        //Box box4 = new BoxWeight(3,5,6,2);
        // here reference (box4) is of type 'Box', but object is of type 'BoxWeight'.
//        System.out.println(box4.weight); // can't access properties of 'BoxWeight' class.
        // type of ref determines the properties that we can access. We can only access properties of type of ref
        // and it's parent.


        // BoxWeight box6 = new Box(1,4,6); // error
        // type of child can't reference parent. Why??
        // Because, here constructor of parent class is being called. So we can't initialise the properties of child
        // class. So it is not allowed to reference parent class from type of child class.


        // Multilevel
        // One class extending another class, extending other class.
        BoxPrice box7 = new BoxPrice(4,5,6);
        System.out.println(box7.cost);

        BoxWeight box8 = new BoxPrice(3,4,5,6,7);
        System.out.println(box8.l + box8.h + box8.w+box8.weight);


    }
}
