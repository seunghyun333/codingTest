class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] array = new String[1];
        array[0] = cipher;
        int length = cipher.length();
        
        for(int i = code; i < length+1; i+=code) {
            answer += cipher.charAt(i-1);
        }
        
        
        return answer;
    }
}