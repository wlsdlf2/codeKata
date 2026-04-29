class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int xCount = 0;
        int yCount = 0;
        String x = "";
        for (String c : s.split("")) {
            if (xCount == 0) {
                x = c;
                xCount++;
                answer++;
                continue;
            }
            
            if (x.equals(c)) {
                xCount++;
            } else {
                yCount++;
            }
            
            if (xCount == yCount) {
                xCount = 0;
                yCount = 0;
            }
        }
        
        return answer;
    }
}