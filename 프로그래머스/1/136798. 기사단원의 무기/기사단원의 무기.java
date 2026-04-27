class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            if (count_nod(i) > limit) {
                answer += power;
            } else {
                answer += count_nod(i);
            }
        }
        
        return answer;
    }
    
    private int count_nod(int num) {
        int count = 0;
        
        for (int i = 1 ; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i * i == num) count++;
                else count += 2;
            }
        }
        
        return count;
    }
}