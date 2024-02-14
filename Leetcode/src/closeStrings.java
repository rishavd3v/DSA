// #1657 - https://leetcode.com/problems/determine-if-two-strings-are-close/description/
import java.util.Arrays;

public class closeStrings {

    class Solution{
        public boolean closeStrings(String word1, String word2){
            int[] count1 = new int[26];
            int[] count2 = new int[26];
            if(word1.length()!=word2.length()){
                return false;
            }
            int len = word1.length();
            int i=0;
            while(i<len){
                char ch = word1.charAt(i);
                if(word2.indexOf(ch)==-1){
                    return false;
                }
                i++;
            }
            i=0;
            while(i<len) {
                int ch1 = word1.charAt(i) - 'a';
                int ch2 = word2.charAt(i) - 'a';
                count1[ch1]++;
                count2[ch2]++;
                i++;
            }
            Arrays.sort(count1);
            Arrays.sort(count2);
            i=0;
            while(i < count1.length){
                if(count1[i]!=count2[i]){
                    return false;
                }
                i++;
            }

            return true;

        }
    }
}
