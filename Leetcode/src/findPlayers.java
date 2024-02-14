import java.util.ArrayList;

public class findPlayers {


    class Solution {
        public ArrayList<ArrayList<Integer>> findWinners(int[][] matches) {
            ArrayList<Integer> winners = new ArrayList<>();
            ArrayList<Integer> losers = new ArrayList<>();
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            int n = matches.length;
            for(int i=0;i<n;i++){
                winners.add(matches[i][0]);
                losers.add(matches[i][1]);
            }
            for(int i=0;i<winners.size();i++){
                int player = winners.get(i);
                if(!losers.contains(player)){
                    result.get(0).add(player);
                }
            }
            for (int i = 0; i<losers.size()-1; i++) {
                int count =0;
                for(int j=1;j<losers.size();j++){
                    if(losers.get(i)== losers.get(j)){
                        count++;
                    }
                }
                if(count==0){
                    result.get(1).add(i);
                }
            }


            return result;
        }
    }
}
