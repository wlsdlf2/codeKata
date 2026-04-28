class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canSay = {"aya", "ye", "woo", "ma"};
        
        for (String bab : babbling) {
            for (String word : canSay) {
                if (bab.contains(word + word)) break;
                else if (bab.contains(word)) {
                    bab = bab.replace(word, " ");
                }
            }
            if (bab.trim().equals("")) answer++;
        }
        
        return answer;
    }
}