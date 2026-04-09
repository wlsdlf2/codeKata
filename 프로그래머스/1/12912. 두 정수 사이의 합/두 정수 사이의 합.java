class Solution {
    public long solution(int a, int b) {
        if(a == b) {
            return a;
        }
        
        long answer = 0;
        int max_num = Math.max(a, b);
        int min_num = (max_num == a) ? b : a;
        
        for(int i = min_num; i <= max_num; i++) {
            answer += i;
        }
        
        return answer;
    }
}