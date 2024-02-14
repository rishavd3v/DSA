// Ques#1347 - https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/description/
public class anagram {

    class Solution {
        public int minSteps(String s, String t) {
            int[] count = new int[26];
            int ans = 0;
            int i = 0;

            // Storing the difference of frequencies of characters in t and s.
            while (i < s.length()) {
                count[s.charAt(i) - 'a']++;
                count[t.charAt(i) - 'a']--;
                i++;
            }

            i=0;
            while (i < 26) {
                if(count[i]>0){
                    ans += count[i];
                }
                i++;
            }

            return ans;
        }
    }



}