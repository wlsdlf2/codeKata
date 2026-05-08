import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }
        
        for (String call : callings) {
            int currRank = rank.get(call);
            int prevRank = currRank - 1;
            String prevPlayer = players[prevRank];
            
            players[prevRank] = call;
            players[currRank] = prevPlayer;
            
            rank.put(call, prevRank);
            rank.put(prevPlayer, currRank);
        }
        
        return players;
    }
}