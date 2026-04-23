class Solution {
    public int solution(int[] nums) {
        return combination(nums, 0, 3, 0);
    }
    
    private int combination(int[] nums, int start, int r, int sum) {
        if (r == 0) {
            return isPrime(sum) ? 1 : 0;
        }
        
        int count = 0;
        for (int i = start; i < nums.length; i++) {
            count += combination(nums, i + 1, r - 1, sum + nums[i]);
        }
        
        return count;
    }
    
    private boolean isPrime(int num) {
        // 1이상 숫자 3개의 합의 소수 판별이기 때문에 최소 3이상임.
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}