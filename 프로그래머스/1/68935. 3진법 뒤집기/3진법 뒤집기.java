class Solution {
    public int solution(int n) {
        String result = "";
        
        while (n > 0) {
            int mod = n % 3;
            n /= 3;
            result += String.valueOf(mod);
        }
        
        return Integer.parseInt(result, 3);
    }
}