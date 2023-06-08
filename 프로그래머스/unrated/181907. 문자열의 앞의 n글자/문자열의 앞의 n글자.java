class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = my_string.toCharArray();
      
        for(int i = 0; i < n; i++) {
           char c = charArray[i];
            sb.append(c);
        } 
        
        String answer = sb.toString();
        return answer;
    }
}