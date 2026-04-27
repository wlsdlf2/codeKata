import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        
        Set<Integer> set = new HashSet<>();
        for (int win_num : win_nums) {
            set.add(win_num);
        }
        
        int count = 0;
        int zero_count = 0;
        for (int num : lottos) {
            if (set.contains(num)) {
                count++;
            }
            if (num == 0) zero_count++;
        }
        
        int max_rank = rank[count + zero_count];
        int min_rank = rank[count];
        
        return new int[] {max_rank, min_rank};
    }
}