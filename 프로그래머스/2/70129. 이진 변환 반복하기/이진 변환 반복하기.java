class Solution {
    public int[] solution(String s) {
        int tryCount = 0;
        int zeroCount = 0;
        
        while (!s.equals("1")) {
            tryCount++;
            
            int ones = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') ones++;
                else zeroCount++;
            }
            
            s = toBinary(ones);
        }
        
        return new int[]{tryCount, zeroCount};
    }
    
    private String toBinary(int len) {
        StringBuilder result = new StringBuilder();
        while (len > 0) {
            result.append(len % 2);
            len /= 2;
        }
        
        return result.reverse().toString();
        
    }
}