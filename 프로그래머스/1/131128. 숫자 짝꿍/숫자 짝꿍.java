import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        
        for (String s : X.split("")) xCount[Integer.parseInt(s)]++;
        for (String s : Y.split("")) yCount[Integer.parseInt(s)]++;
            
        for (int i = 9; i >= 0; i--) {
            int common = Math.min(xCount[i], yCount[i]);
            
            for (int j = 0; j < common; j++) {
                sb.append(i);
            }
        }
        
        String answer = sb.toString();
        
        if (answer.isEmpty()) return "-1";
        if (answer.startsWith("0")) return "0";
        
        return answer;
    }
}