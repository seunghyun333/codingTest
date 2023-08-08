import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int[] intarr = new int[str.length];
        
        for(int i = 0; i < str.length; i++) {
            intarr[i] = Integer.parseInt(str[i]);
        }

        int last = str.length-1;
        Arrays.sort(intarr);

        answer += intarr[0];
        answer += " ";
        answer += intarr[last];
        
        
        return answer;
    }
}