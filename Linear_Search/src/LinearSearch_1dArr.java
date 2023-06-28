public class LinearSearch_1dArr {
    public static void main(String[] args) {
        int[] nums = {1,4,9,88,41,21,7,66,21,54};
        int target = 21;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // Search in arrays. Return the index if item found otherwise return -1.
    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        // Loop to check every element in array;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;               // If element is not found

    }
}

