import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        Map<String, Integer> currentMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            currentMap.put(discount[i], currentMap.getOrDefault(discount[i], 0) + 1);
        }
        
        if (wantMap.equals(currentMap)) answer++;
        
        for (int i = 10; i < discount.length; i++) {
            String nextItem = discount[i];
            currentMap.put(nextItem, currentMap.getOrDefault(nextItem, 0) + 1);
            
            String outItem = discount[i - 10];
            if (currentMap.get(outItem) == 1) {
                currentMap.remove(outItem);
            } else {
                currentMap.put(outItem, currentMap.get(outItem) - 1);
            }
            
            if (wantMap.equals(currentMap)) answer++;
        }
        
        return answer;
    }
}