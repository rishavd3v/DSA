public class wrapperClasses {
    public static void main(String[] args) {
        int a = 10; // primitive
        Integer num = 45; // object
        // 'Integer' is a wrapper class.

        int num1 = 10;
        int num2 = 20;
        swap(num1,num2);
        System.out.println(num1+" "+num2);
        // num1 and num2 will not swap. Because primitives are passed by values.

        Integer x = 100;
        Integer y = 200;
        swap(x,y);

        // here x&b are being passed by reference.
        System.out.println(x+" "+y);
        //values will still not swap because Integer is a final class.
    }

    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap(Integer a,Integer b){
        int temp = a;
        a = b;
        b = temp;
    }


}
