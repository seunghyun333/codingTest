class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char x : myString.toCharArray()) {
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            } else {
                answer += x;
            }
        }
        return answer;
    }
}