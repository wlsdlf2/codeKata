import java.util.*;

class Solution {
    
    private void combination(int[] arr, boolean[] visited, int start, int r, Set<Integer> set) {
        if (r == 0) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) {
                    sum += arr[i];
                }
            }
            
            set.add(sum);
            return;
        }
        
        for (int i = start; i < arr.length; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, r - 1, set);
            visited[i] = false;
        }
    }
    
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        boolean[] visited = new boolean[numbers.length];
        
        combination(numbers, visited, 0, 2, set);
        
        return set.stream()
                  .mapToInt(Integer::intValue)
                  .sorted()
                  .toArray();
    }
}