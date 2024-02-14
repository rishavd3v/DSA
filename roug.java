//Ques#451 - https://leetcode.com/problems/sort-characters-by-frequency/description/

import java.util.ArrayList;
import java.util.Arrays;

public class roug {
    public static void main(String[] args) {
        String str = "tree";
        System.out.println(Solution.frequencySort(str));
    }

    class Solution {
        public static String frequencySort(String s) {
            int[] list = new int[26];
            char[] str = s.toCharArray();
            ArrayList<Character> ans = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                int x = str[i]-97;
                list[x]++;
            }

            for (int i = 0; i < list.length; i++) {
                int max = 0;
                for (int j = 0; j < list.length; j++) {
                    if(list[j]==0){
                        continue;
                    }
                    if(list[j]>=list[max]){
                        max = j;
                    }
                }

                for (int k = 0; k < list[max]; k++) {
                    ans.add((char)(max+97));
                }
                list[max] = 0;
            }
            return ans.toString();
        }
    }





}
