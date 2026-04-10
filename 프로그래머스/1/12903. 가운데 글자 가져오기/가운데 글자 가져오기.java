class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        
        if (len % 2 != 0) {
            answer = String.valueOf(s.charAt((len - 1) / 2));
        } else {
            int mid = len / 2;
            answer = s.substring(mid - 1, mid + 1);
        }
        
        return answer;
    }
}