import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] no1 = {1, 2, 3, 4, 5};
        int[] no2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] no3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (no1[i % 5] == answers[i]) score1++;
            if (no2[i % 8] == answers[i]) score2++;
            if (no3[i % 10] == answers[i]) score3++;
        }
        
        int max = Math.max(score1, Math.max(score2, score3));
        List<Integer> answer = new ArrayList<>();
        
        if (score1 == max) answer.add(1);
        if (score2 == max) answer.add(2);
        if (score3 == max) answer.add(3);
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}