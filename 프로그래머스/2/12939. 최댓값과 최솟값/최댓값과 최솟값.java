class Solution {
    public String solution(String s) {
        String[] nums = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String str : nums) {
            int num = Integer.parseInt(str);
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        
        return min + " " + max;
    }
}