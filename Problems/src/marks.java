import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks;
        System.out.println("Enter Marks out of 100");
        marks = in.nextInt();
        grade(marks);
    }

    static void grade(int a){
        if (a>90){
            System.out.println("AA");
        }
        else if (a>80 && a<91){
            System.out.println("AB");
        }
        else if (a>70 && a<81){
            System.out.println("BB");
        }
        else if (a>60 && a<71){
            System.out.println("BC");
        }
        else if (a>50 && a<61){
            System.out.println("CD");
        }
        else if (a>40 && a<51){
            System.out.println("DD");
        }
        else if (a<41){
            System.out.println("Fail");
        }


    }
}
