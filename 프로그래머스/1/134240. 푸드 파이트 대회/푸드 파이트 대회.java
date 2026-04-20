class Solution {
    public String solution(int[] food) {
        String left = "";
        String right = "";
        
        for (int i = 1; i < food.length; i++) {
            String segment = String.valueOf(i).repeat(food[i] / 2);
            left += segment;
            right = segment + right;
        }
        
        return left + "0" + right;
    }
}