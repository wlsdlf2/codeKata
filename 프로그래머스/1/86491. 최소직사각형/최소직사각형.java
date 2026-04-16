class Solution {
    public int solution(int[][] sizes) {
        int max_h = 0;
        int max_w = 0;
        
        for (int[] size : sizes) {
            max_h = Math.max(max_h, Math.max(size[0], size[1]));
            max_w = Math.max(max_w, Math.min(size[0], size[1]));
        }
        
        return max_h * max_w;
    }
}