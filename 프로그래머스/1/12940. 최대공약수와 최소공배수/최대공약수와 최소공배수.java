class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcd = gcd(n, m);
        int lcm = (n * m) / gcd;
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
}