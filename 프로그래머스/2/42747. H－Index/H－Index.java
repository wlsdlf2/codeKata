import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        
        if (citations[citations.length - 1] == 0) return 0;
        
        int hIndex = 0;
        for (int i = 0; i < citations.length; i++) {
            int citation = citations[citations.length - 1 - i];
            int count = i + 1;
            
            if (citation >= count) {
                hIndex = count;
            } else {
                break;
            }
        }
        
        return hIndex;
    }
}