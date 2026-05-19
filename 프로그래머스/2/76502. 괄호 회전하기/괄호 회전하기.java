import java.util.*;

class Solution {
    public int solution(String s) {
        if (s.length() % 2 != 0) return 0;
        
        Deque<Character> queue = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            queue.offer(c);
        }
        
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isValid(queue)) answer++;
            
            queue.offer(queue.poll());
        }
        
        return answer;
    }
    
    private boolean isValid(Deque<Character> queue) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char c : queue) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                
                if (isPair(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    private boolean isPair(char open, char close) {
        if (open == '(') return close == ')';
        if (open == '[') return close == ']';
        if (open == '{') return close == '}';
        return false;
    }
}