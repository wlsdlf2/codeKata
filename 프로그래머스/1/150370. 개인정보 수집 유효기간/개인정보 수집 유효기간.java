import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]) * 28);
        }
        
        int todayTotal = getDate(today);
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            int collectDate = getDate(parts[0]);
            int period = termMap.get(parts[1]);
            
            if (collectDate + period <= todayTotal) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private int getDate(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        return (year * 12 * 28) + (month * 28) + day;
    }
}