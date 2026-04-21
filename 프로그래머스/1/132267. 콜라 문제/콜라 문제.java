class Solution {
    
    private int change_coke(int a, int b, int n) {
        if (n < a) return 0;
        
        int return_coke = (n / a) * b;
        n = (n % a) + return_coke;
        return return_coke + change_coke(a, b, n);
    }
    
    public int solution(int a, int b, int n) {
        return change_coke(a, b, n);
    }
}