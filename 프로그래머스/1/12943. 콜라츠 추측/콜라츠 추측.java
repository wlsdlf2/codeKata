class Solution {
    public int solution(int num) {
        if(num == 1) return 0;
        
        long n = num;
        int i = 0;
        while(i < 500) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            
            i++;
            if(n == 1) return i;
        }
        
        return -1;
    }
}