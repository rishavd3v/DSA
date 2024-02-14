public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(Solution.majorityElement(arr));
    }


    class Solution{
        public static int majorityElement(int[] arr) {
            int count = 0;
            int ans= 0;
            for(int i:arr){
                if(count==0){
                    ans = i;
                    count = 1;
                }
                else if(ans==i){
                    count++;
                }else count--;
            }
            return ans;
        }
    }



}
