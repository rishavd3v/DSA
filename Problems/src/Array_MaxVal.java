public class Array_MaxVal {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,8,3};
        System.out.println(max(arr));
    }
    static int max (int[] arr){
        int maxValue=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }


        }
        return maxValue;
    }
}
