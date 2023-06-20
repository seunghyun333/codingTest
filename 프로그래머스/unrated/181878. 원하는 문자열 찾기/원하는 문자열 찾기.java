class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        // 대소문자를 모두 소문자로 변환하여 비교
        String myString1 = myString.toLowerCase();
        String pat1 = pat.toLowerCase();
        
        if(myString1.contains(pat1)) {
            answer = 1;
        }
        return answer;
    }
}