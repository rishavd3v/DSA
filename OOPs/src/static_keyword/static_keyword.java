package static_keyword;

public class static_keyword {

    public static void main(String[] args) {
        // greeting();
        // we cannot access static functions from a non-static one.
        // something that is not static belongs to an object.

        // Here 'greeting' function requires an instance.


        // to access non-static stuff form static context, we will have to reference it.
        static_keyword obj = new static_keyword();
        obj.greeting();
    }


    void greeting(){
        System.out.println("Hello");
    }
}
