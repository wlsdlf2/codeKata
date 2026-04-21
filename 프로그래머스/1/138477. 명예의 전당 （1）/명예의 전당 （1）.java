import java.util.*;

class Solution {
    public int[] solution(int k, int[] scores) {
        int[] answer = new int[scores.length];
        List<Integer> hof = new ArrayList<>();
        
        int day = 0;
        for (int score: scores) {
            hof.add(score);
            
            hof.sort(Collections.reverseOrder());
            if (day < k) {
                answer[day] = hof.get(day);
            } else {
                answer[day] = hof.get(k - 1);
            }
            
            day++;
        }
        
        return answer;
    }
}