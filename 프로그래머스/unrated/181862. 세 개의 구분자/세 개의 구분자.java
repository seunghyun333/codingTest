import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String[] solution(String myStr) {
        List<String> result = new ArrayList<>();
        StringBuilder currentSubstring = new StringBuilder();
        
        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (currentSubstring.length() > 0) {
                    result.add(currentSubstring.toString());
                    currentSubstring.setLength(0);
                }
            } else {
                currentSubstring.append(c);
            }
        }
        
        // 마지막 구분자 이후에도 문자열이 있는 경우
        if (currentSubstring.length() > 0) {
            result.add(currentSubstring.toString());
        }
        
        if (result.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return result.toArray(new String[0]);
        }
    }
}