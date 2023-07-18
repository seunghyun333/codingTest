class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int number = phone_number.length()-4;
        
        for (int i = 0; i < number; i++) {
            answer += "*";
        }
        
        for (int i = number; i < phone_number.length(); i++) {
            answer += phone_number.charAt(i);
        }
        return answer;
    }
}