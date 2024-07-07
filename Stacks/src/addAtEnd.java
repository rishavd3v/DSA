import java.util.Stack;

public class addAtEnd {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Original Stack: " + stack);
//        addElementToEnd(stack, 4);
        reverse(stack);
        System.out.println("Stack after adding element at end: " + stack);
    }

    public static void addToEnd(Stack<Integer> stack, int target) {
        if (stack.isEmpty()) {
            stack.push(target);
        }
        else {
            int temp = stack.pop();
            addToEnd(stack, target);
            stack.push(temp);
        }
    }
    static void reverse(Stack<Integer> stk){
        if(stk.isEmpty()){
            return;
        }
        else {
            int temp = stk.pop();
            reverse(stk);
            addToEnd(stk,temp);
        }
    }
}