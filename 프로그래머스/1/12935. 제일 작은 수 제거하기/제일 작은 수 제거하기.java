import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        
        int min_num = arr[0];
        for (int num : arr) {
            if (num < min_num) min_num = num;
        }
        
        int[] answer = new int[arr.length - 1];
        int i = 0;
        for (int num : arr) {
            if (num == min_num) continue;
            answer[i++] = num;
        }
        
        return answer;
    }
}