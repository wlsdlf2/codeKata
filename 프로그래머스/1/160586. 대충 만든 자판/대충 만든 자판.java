import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] minClick = new int[26];
        Arrays.fill(minClick, Integer.MAX_VALUE);
        
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                if (minClick[c - 'A'] > i + 1) minClick[c - 'A'] = i + 1;
            }
        }
        
        int index = 0;
        for (String target : targets) {
            int sum = 0;
            for (char c : target.toCharArray()) {
                if (minClick[c - 'A'] == Integer.MAX_VALUE) {
                    sum = -1;
                    break;
                }
                sum += minClick[c - 'A'];
            }
            answer[index++] = sum;
        }
        
        return answer;
    }
}