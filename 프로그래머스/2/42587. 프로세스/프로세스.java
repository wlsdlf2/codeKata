import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        List<Integer> list = new ArrayList<>();
        for (int p : priorities) {
            list.add(p);
        }
        
        int order = 0;
        
        while (!list.isEmpty()) {
            int maxPriority = Collections.max(list);
            
            int current = list.remove(0);
            
            if (current == maxPriority) {
                order++;
                
                if (location == 0) {
                    return order;
                }
            }
            
            else {
                list.add(current);
            }
            
            if (location == 0) {
                location = list.size() - 1;
            } else {
                location--;
            }
        }
        
        return order;
    }
}