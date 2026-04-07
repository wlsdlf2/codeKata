class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        for (int num : numbers) {
            answer += (double) num;
        }
        answer /= numbers.length;
        
        return answer;
    }
}