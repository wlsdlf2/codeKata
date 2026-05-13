class Solution {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow;
        int h = 0;
        int w = 0;
        
        for (int i = 3; i <= Math.sqrt(area); i++) {
            if (area % i == 0) {
                w = area / i;
                if ((i - 2) * (w - 2) == yellow) {
                    h = i;
                    break;
                }
            }
        }
        
        return new int[]{w, h};
    }
}