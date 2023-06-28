import java.util.ArrayList;
import java.util.Scanner;

public class arrayList_2 {
    public static void main(String[] args) {
        // Multidimensional ArrayList
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialisation
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());        // To create Arraylist within a Arraylist
        }

        // Adding Elements
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                list.get(i).add(in.nextInt());

            }

        }
         System.out.println(list);



    }

}
