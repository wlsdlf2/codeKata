class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long cost = 0L;
        for (int i = 1; i <= count; i++) {
            cost += price * i;
        }
        
        if (money - cost > 0) {
            return 0L;
        } else {
            answer = cost - money;
            return answer;
        }
    }
}