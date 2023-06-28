public class linearSearch_range {
    public static void main(String[] args) {
         int[] arr = {18,14,21,41,10,39};
         int target = 41;
        System.out.println(linearSearch(arr, target, 1,4));

    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length ==0){
            return -1;
        }
        for (int index = start; index<=end; index++){            // Here we will iterate the loop from start to end  range.
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;                       // This will execute if element is not in our range.
    }
}
