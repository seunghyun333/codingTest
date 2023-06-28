class Solution {
    public String solution(String my_string) {
        StringBuilder answerBuilder = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if (answerBuilder.indexOf(String.valueOf(currentChar)) == -1) {
                answerBuilder.append(currentChar);
            }
        }
        
        return answerBuilder.toString();
    }
}