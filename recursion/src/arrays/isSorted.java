package arrays;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {1,4,7,8};
        boolean ans = sorted(arr,0);
        System.out.println(ans);
    }

    static boolean sorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }

        return arr[index]<=arr[index+1] && sorted(arr,index+1);
    }
}
