import java.util.Arrays;

public class Strings {
    public static void main(String[] args){
        String name = "Rishav";
        System.out.println(name);

        // Strings are immutable. Cannot modify it.
        name = "Raj";  // This will create a new object
        System.out.println(name);
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));

        String name1 = "Rishav";
        String name2 = "Rishav";
        // both of these variable will point at the same object. Two different objects are not created.
        System.out.println(name1 == name2); // True because both variable points at same objects.

         String name3 = new String("Rishav");
         String name4 = new String("Rishav");
         // This will create two different objects
        System.out.println(name3==name4); // False because different objects

        System.out.println(name3.equals(name4)); // True
        // This will only check the values of variable.

        System.out.println(name1.length());
        System.out.println(name1.toLowerCase());
        System.out.println(name1.toUpperCase());

        // some string methods
        String str = "Hi my name is Rishav";
        System.out.println(str.strip()); // removes leading and trailing white spaces.
        System.out.println(Arrays.toString(str.split(" ")));
    }
}
