class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        String display_num = phone_number.substring(len - 4);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len - 4; i++) {
            sb.append('*');
        }
        answer = sb + display_num;
        
        return answer;
    }
}