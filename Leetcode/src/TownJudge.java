public class TownJudge {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] arr = {{1,3}, {2,4},{2,3},{1,4},{4,3}};
        int ans = obj.findJudge(4,arr);
        System.out.println(ans);
    }
}

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] count = new int[n+1];
        for(int i=0;i<trust.length;i++){
            count[trust[i][0]] = -1;
            count[trust[i][1]]++;
        }
        for(int i=1;i<=n;i++){
            if(count[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}
