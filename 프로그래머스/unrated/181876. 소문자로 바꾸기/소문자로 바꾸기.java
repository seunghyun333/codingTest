class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char x : myString.toCharArray()) {
            
             if(Character.isUpperCase(x)) {
                answer += Character.toLowerCase(x);
            } else { 
                 answer += Character.toLowerCase(x);
             }
        }
        return answer;
    }
}

