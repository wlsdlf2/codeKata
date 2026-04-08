import java.util.*;

class Solution {
    public long solution(long n) {
        String[] strArr = String.valueOf(n).split("");
        Arrays.sort(strArr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for (String s : strArr) sb.append(s);
        
        return Long.parseLong(sb.toString());
    }
}