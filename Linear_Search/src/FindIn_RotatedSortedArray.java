public class FindIn_RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,7};
        int[] arr1 = {1,3};
        int target = 2;
        System.out.println(search(arr1, target));
    }

    static int search (int[] arr, int target){
        if(arr[0]<arr[arr.length-1]){
            return BinarySearch(arr, target, 0, arr.length-1);
        }
        int pivot = findPivot(arr);
        int first = BinarySearch(arr, target, 0 , pivot);
        if (first != -1){
            return first;
        }
        return BinarySearch(arr, target, pivot+1, arr.length-1);

    }

    static int findPivot (int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[start]){
                start=mid;
            }
            else if (arr[mid]<arr[start]){
                end = mid;
            }
            else return mid;

        }
        return -1;

    }

    static int BinarySearch (int[] arr, int target, int start, int end){
        // Here we will use OrderAgnostic Binary Search because first ahlf is Ascending and second half is in descending order.

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else if (target>arr[mid]){
                    start = mid+1;
                }else {
                    return mid;
                }
            }
            else {
                if(target>arr[mid]){
                    end = mid-1;
                }else if (target<arr[mid]){
                    start = mid+1;
                }else {
                    return mid;
                }
            }

        }
        return -1;
    }

}

