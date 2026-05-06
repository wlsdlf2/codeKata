import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scoreMap = new HashMap<>();
        
        for (int i = 0; i < survey.length; i++) {
            int score = Math.abs(choices[i] - 4);
            Character target;
            
            if (choices[i] == 4) {
                continue;
            } else if (choices[i] > 4) {
                target = survey[i].charAt(1);
            } else {
                target = survey[i].charAt(0);
            }
            scoreMap.put(target, scoreMap.getOrDefault(target, 0) + score);
        }
        
        StringBuilder sb = new StringBuilder();
        char[][] indicators = {{'R','T'}, {'C','F'}, {'J', 'M'}, {'A', 'N'}};
        
        for (char[] pair : indicators) {
            char first = pair[0];
            char second = pair[1];
            
            int firstScore = scoreMap.getOrDefault(first, 0);
            int secondScore = scoreMap.getOrDefault(second, 0);
            
            if (secondScore > firstScore) {
                sb.append(second);
            } else {
                sb.append(first);
            }
        }
        
        return sb.toString();
    }
}