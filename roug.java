import java.util.*;

class rough{
    public static void main(String[] args) {
        int[][] arr = {{3,1,3},{1,2,2},{0,3,3}};
        List<Integer> ans =  Solution.findAllPeople(4,arr,3);
        System.out.println(ans.toString());
    }
    class Solution {
        public static List<Integer> findAllPeople(int n, int[][] arr, int firstPerson) {

            for (int i=0;i< arr.length;i++){
                for(int j=1;j<arr.length;j++){
                    if(arr[j][2]<arr[j-1][2]){
                        int[] temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                }
            }
            List<Integer> secret = new ArrayList<>();
            secret.add(0);
            secret.add(firstPerson);

            for(int i=0;i<arr.length;i++){
                if(i!=arr.length-1 && arr[i][2]==arr[i+1][2]){
                    if(!secret.contains(arr[i][0]) || !secret.contains(arr[i][1])){
                        int[] temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }
                }
            }
            for(int i=0;i<arr.length;i++){
                if(secret.contains(arr[i][0]) || secret.contains(arr[i][1])){
                    if(!secret.contains(arr[i][0])){
                        secret.add(arr[i][0]);

                    }
                    if(!secret.contains(arr[i][1])){
                        secret.add(arr[i][1]);

                    }
                }
            }

            Collections.sort(secret);
            return secret;
        }



    }
}