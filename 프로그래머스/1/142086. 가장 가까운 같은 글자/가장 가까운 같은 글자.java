import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        
        int index = 0;
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, index);
                answer[index] = -1;
            } else {
                answer[index] = index - map.get(c);
                map.put(c, index);
            }
            index++;
        }
        
        return answer;
    }
}