import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        List<Character> alphabet = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!skip.contains(String.valueOf(c))) {
                alphabet.add(c);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int currentIndex = alphabet.indexOf(c);
            
            int nextIndex = (currentIndex + index) % alphabet.size();
            
            sb.append(alphabet.get(nextIndex));
        }
        
        return sb.toString();
    }
}