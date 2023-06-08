import java.util.Arrays;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        char[] charArray = my_string.toCharArray();
        
        for (int i = 0; i < my_string.length(); i++) {
            char[] subArray = Arrays.copyOfRange(charArray, 0, i + 1);
            String substring = new String(subArray);
            
            if (substring.equals(is_prefix)) {
                answer = 1;
                break; // 일치하는 접두사를 찾았으므로 반복문 종료
            } else {
                answer = 0;
            }
        }
        
        return answer;
    }
}