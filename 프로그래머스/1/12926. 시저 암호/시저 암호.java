class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                
                result.append((char) ((c - base + n) % 26 + base));
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}