import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i = 0; i < 10; i++) {
            int curr = i;
            if(!Arrays.stream(numbers).anyMatch(num -> num == curr)) {
                answer += curr;
            }
        }
        
        return answer;
    }
}