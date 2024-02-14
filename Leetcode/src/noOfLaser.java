// Ques2125 - https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/


public class noOfLaser{
    public static void main(String[] args) {
        String[] bank = {"000","111","000"};

    }


    class Solution {
        public int numberOfBeams(String[] bank) {
            int ans = 0;
            int m = bank.length;
            int n = bank[0].length();
            for (int i = 0; i<m-1;) {
                int laserCount1;
                int laserCount2 = 0;
                if(i==m-1){
                    return ans;
                }
                laserCount1 = Count(bank[i],n);
                if(laserCount1 == 0){
                    i++;
                    continue;
                }

                for (int j = i+1; j < m; j++) {
                    laserCount2 = Count(bank[j],n);
                    if(laserCount2 == 0 && j!=m-1){
                        continue;
                    }
                    if(laserCount2==0 && j==m-1){
                        i++;
                        continue;
                    }
                    i = j;
                    ans += laserCount1*laserCount2;
                    break;
                }
            }

            return ans;

        }

        static int Count(String str,int n){
            char[] ch = str.toCharArray();
            int count = 0;
            for (int i = 0; i < n; i++) {
                if(ch[i]=='1'){
                    count++;
                }
            }
            return count;
        }
    }
}