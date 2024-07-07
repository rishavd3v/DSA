package arrays;

public class linerSearch {
    public static void main(String[] args) {
        int[] arr = {4,5,12,5,0,7};
        int target = 12;
        int ans = find(arr,target,0);
        System.out.println(ans);
    }

    static int find(int[] arr,int target,int index){
        if(arr[index]==target && index<arr.length){
            return index;
        }
        if(index==arr.length-1){
            return -1;
        }
        return find(arr,target,index+1);
    }
}
