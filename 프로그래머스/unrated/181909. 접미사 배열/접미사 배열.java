import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
         int count = 0;

            for (int i = my_string.length()-1; i >= 0; i--) {
             answer[count] = my_string.substring(i);
                count++;
        }
        
        Arrays.sort(answer);

        

        return answer;
    }
}