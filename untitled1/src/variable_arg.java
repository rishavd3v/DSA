import java.util.Arrays;

public class variable_arg {
    public static void main(String[] args) {
        var(2,3,4,8,6,41,4);
    }
    static void var(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
