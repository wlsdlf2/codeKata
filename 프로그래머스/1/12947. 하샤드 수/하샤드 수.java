class Solution {
    public boolean solution(int x) {
        int curr = x;
        int sum = 0;
        while(curr > 0) {
            sum += curr % 10;
            curr /= 10;
        }
        
        if(x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}