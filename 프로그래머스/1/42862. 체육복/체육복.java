import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        for (int r : reserve) {
            if (r == -1) continue;
            
            for (int i = 0; i < lost.length; i++) {
                if (lost[i] == r - 1 || lost[i] == r + 1) {
                    lost[i] = -1;
                    break;
                }
            }
        }
        
        int answer = n;
        for (int l : lost) {
            if (l != -1) answer--;
        }
        
        return answer;
    }
}