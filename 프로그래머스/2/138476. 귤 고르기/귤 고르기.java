import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> tMap = new HashMap<>();
        for (int t : tangerine) {
            tMap.put(t, tMap.getOrDefault(t, 0) + 1);
        }
        
        List<Integer> counts = new ArrayList<>(tMap.values());
        counts.sort(Collections.reverseOrder());
        
        int answer = 0;
        int sum = 0;
        for (int count : counts) {
            answer++;
            sum += count;
            
            if (sum >= k) break;
        }
        
        return answer;
    }
}