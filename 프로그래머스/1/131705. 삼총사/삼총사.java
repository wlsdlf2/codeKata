class Solution {

    int answer = 0;
    
    public int solution(int[] number) {
        combination(number, 0, 0, 0);        
        return answer;
    }
    
    private void combination(int[] number, int start, int count, int currentSum) {
        if (count == 3) {
            if (currentSum == 0) {
                answer ++;
            }
            return;
        }
        
        for (int i = start; i < number.length; i++) {
            combination(number, i + 1, count + 1, currentSum + number[i]);
        }
    }
}