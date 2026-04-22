import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        List<Integer> scores = new ArrayList<>();
        for (int s : score) {
            scores.add(s);
        }
        
        scores.sort(Comparator.reverseOrder());
        int answer = 0;
        for (int i = 0; i < score.length / m; i++) {
            answer += scores.get((i+1) * m - 1) * m;
        }
        
        return answer;
    }
}