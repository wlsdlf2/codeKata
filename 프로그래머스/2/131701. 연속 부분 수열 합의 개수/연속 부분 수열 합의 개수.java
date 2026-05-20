import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int n = elements.length;
        
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < len; j++) {
                    sum += elements[(i + j) % n];
                }
                set.add(sum);
            }
        }
        
        return set.size();
    }
}