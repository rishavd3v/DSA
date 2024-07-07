import java.util.ArrayList;

public class allPossibleSubset {
    public static void main(String[] args) {
    // Print all possible subset of given string
        String str = "abc";
        subset(str,"");

        // In these subset kind of  ques, there will be two scenario. First where we will take a char and another where
        // we will ignore
        // that char
        // First recursion call will be NS=a S=bc
        // Second recursion call will be NS=null S=bc ... so on
    }

    public static void subset(String str, String newString){
        if(str.isEmpty()){
            System.out.print (newString+" ");
            return;
        }

        subset(str.substring(1),newString+str.charAt(0));
        subset(str.substring(1),newString);
    }
}
