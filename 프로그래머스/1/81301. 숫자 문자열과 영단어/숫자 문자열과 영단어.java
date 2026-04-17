import java.util.*;

class Solution {
    public int solution(String s) {
        String answer = s;
        
        Map<String, String> map = Map.of(
            "zero", "0",
            "one", "1",
            "two", "2",
            "three", "3",
            "four", "4",
            "five", "5",
            "six", "6",
            "seven", "7",
            "eight", "8",
            "nine", "9");
        
        for (Map.Entry<String, String> entry : map.entrySet()) {
            answer = answer.replace(entry.getKey(), entry.getValue());
        }
        
        return Integer.parseInt(answer);
    }
}