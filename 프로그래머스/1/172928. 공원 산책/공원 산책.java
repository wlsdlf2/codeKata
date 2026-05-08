import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        Map<String, int[]> opMap = new HashMap<>();
        opMap.put("E", new int[]{0, 1});
        opMap.put("W", new int[]{0, -1});
        opMap.put("N", new int[]{-1, 0});
        opMap.put("S", new int[]{1, 0});
        
        int h = park.length;
        int w = park[0].length();
        int cr = 0;
        int cc = 0;
        for (int r = 0; r < h; r++) {
            for (int c = 0; c < w; c++) {
                if (String.valueOf(park[r].charAt(c)).equals("S")) {
                    cr = r;
                    cc = c;
                    break;
                }
            }
        }
        
        for (String route : routes) {
            String[] parts = route.split(" ");
            int[] op = opMap.get(parts[0]);
            int n = Integer.parseInt(parts[1]);
            
            int nr = cr;
            int nc = cc;
            
            boolean safe = true;
            for (int i = 1; i <= n; i++) {
                int dr = cr + op[0] * i;
                int dc = cc + op[1] * i;
                
                if (dr < 0 || dr >= h || dc < 0 || dc >= w || park[dr].charAt(dc) == 'X') {
                    safe = false;
                    break;
                }
            }
            
            if (safe) {
                cr += op[0] * n;
                cc += op[1] * n;
            }
        }
        
        return new int[]{cr, cc};
    }
}