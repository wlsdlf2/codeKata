import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        Map<String, Integer> reportedMap = new HashMap<>();
        Map<String, Set<String>> reporterMap = new HashMap<>();
        for (String r : reportSet) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            reportedMap.put(reported, reportedMap.getOrDefault(reported, 0) + 1);
            if (!reporterMap.containsKey(reporter)) {
                reporterMap.put(reporter, new HashSet<>());
            }
            reporterMap.get(reporter).add(reported);
        }
        
        int[] result = new int[id_list.length];
        
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            
            if (reporterMap.containsKey(user)) {
                for (String reported : reporterMap.get(user)) {
                    if (reportedMap.get(reported) >= k) {
                        result[i]++;
                    }
                }
            }
        }
        
        return result;
    }
}