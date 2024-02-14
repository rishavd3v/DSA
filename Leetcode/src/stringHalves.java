// Ques#1704 - https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
public class stringHalves {


    class Solution {
        public boolean halvesAreAlike(String str) {
            char[] ch = str.toCharArray();
            int s=0,e=ch.length-1,lcount=0,rcount=0;
            while(s<e){
                if(isVowel(ch[s])){
                    lcount++;
                }
                if(isVowel(ch[e])){
                    rcount++;
                }
                s++;
                e--;
            }
            return lcount == rcount;

        }
        boolean isVowel(char ch){
            if("aeiouAEIOU".indexOf(ch)!= -1){
                return true;
            }
            return false;
        }
    }
}
