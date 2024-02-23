public class FirstUniquesCharacter {
    public static void main(String[] args) {
        String str = "leetcode";
        int ans = Solution.firstUniqChar(str);
//        System.out.println(ans);
        System.out.println('b' - 'a');
    }


    class Solution {
        public static int firstUniqChar(String s) {
            int[] arr = new int[26];
            for(int i=0;i<s.length();i++){
                arr[(int)(s.charAt(i)) - 97]++;
            }
            for(int i=0;i<s.length();i++){
                if(arr[(int)(s.charAt(i))-97]==1){
                    return i;
                }
            }
            return -1;
        }
    }
}